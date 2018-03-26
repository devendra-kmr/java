package com.devendra.sample;

import java.util.stream.Stream;

public class StreamsConcat {

    public static void main(String[] args) {
        Stream<String> str1 = Stream.of("A", "B", "C");
        Stream<String> str2 = Stream.of("B", "A", "D");
        Stream<String> s = Stream.concat(str1, str2);
        s.forEach(e->System.out.print(e+" "));

        str1 = Stream.of("A", "B", "C");
        str2 = Stream.of("B", "A", "D");
        System.out.println("\nRemove duplicates using distinct()");
        s = Stream.concat(str1, str2).distinct();
        s.forEach(e->System.out.print(e+" "));
    }

}
