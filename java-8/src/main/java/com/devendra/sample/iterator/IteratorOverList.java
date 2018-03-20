package com.devendra.sample.iterator;


import java.util.ArrayList;
import java.util.List;

public class IteratorOverList {

    public static void main(String[] args) {
        List<String> countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("Bhutan");
        countryList.add("China");
        countryList.add("Japan");
        countryList.add("Rasia");


        countryList.forEach(country->{
            System.out.println(country);
        });

    }
}
