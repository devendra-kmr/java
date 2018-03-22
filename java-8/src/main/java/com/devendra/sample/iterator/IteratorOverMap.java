package com.devendra.sample.iterator;

import java.util.HashMap;
import java.util.Map;

public class IteratorOverMap {

    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("1", "India");
        countryMap.put("2", "Bhutan");
        countryMap.put("3", "China");
        countryMap.put("4", "Japan");
        countryMap.put("5", "Rasia");

        countryMap.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);

        });

    }
}
