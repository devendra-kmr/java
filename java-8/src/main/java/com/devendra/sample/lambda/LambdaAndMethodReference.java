package com.devendra.sample.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaAndMethodReference {


    public static void main(String args[]) {

        List<String> nameList = Arrays.asList("Devendra", "Akanksha", "Kumar", "Adarsh");

        System.out.println("Using Method reference to call system.out.println : ");
        nameList.stream().map(String::toUpperCase).sorted()
                .forEach(System.out::println);

        System.out.println("Using Lambda function to call system.out.println :");
        nameList.stream().map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));



    }
}
