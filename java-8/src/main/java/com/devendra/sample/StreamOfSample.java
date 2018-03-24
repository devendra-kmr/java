package com.devendra.sample;

import java.util.stream.Stream;

public class StreamOfSample{

public static void main (String[] args){

    Stream.of("Apple","Banana","Mango","Guava").filter(s -> s.startsWith("B"))
            .forEach(s -> System.out.println("Matching String: "+s));

}

}
