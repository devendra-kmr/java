package com.devendra.sample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_MapToList {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(127, "Akanksha");
        map.put(125, "Adarsh");
        map.put(123, "Devendra");
        map.put(121, "Swikarya");
        List<Employee> list = map.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey()))
                .map(e -> new Employee(e.getKey(), e.getValue())).collect(Collectors.toList());
        list.forEach(l -> System.out.println("Id: "+ l.getId()+", Name: "+ l.getName()));
    }
}


class Employee{
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}