package com.devendra.sample.lambda;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class LambdaAndMethodReferenceSample{
        public static void main(String args[]) {

            LambdaAndMethodReferenceSample lamrs = new LambdaAndMethodReferenceSample();

            ArrayList<String> personList = new ArrayList<>();
            personList.add("devendra");
            personList.add("akanksha");
            personList.add("kumar");
            personList.add("adarsh");

            lamrs.convertToUpperCase(personList);
        }

    private String upperCase(String s)
    {
        return s.toUpperCase();
    }

        private void convertToUpperCase(ArrayList<String> personList) {

            System.out.println("Using Lambda function to call upperCase method : ");
            personList.stream().map(s -> this.upperCase(s))
                    .collect(Collectors.toList()).forEach(s -> System.out.println(s));

            System.out.println("Using method reference to call upperCase method : ");
            personList.stream().map(this::upperCase).collect(Collectors.toList())
                    .forEach(System.out::println);

        }



}
