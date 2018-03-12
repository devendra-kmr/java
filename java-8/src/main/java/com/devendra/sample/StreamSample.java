package com.devendra.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {

    public static void main(String [] args) {

        List<String> alphabet = Arrays.asList("a", "b", "c", "d");

        List<String> collect = alphabet.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = number.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1);

}
}
