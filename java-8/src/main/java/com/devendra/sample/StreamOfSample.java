package com.devendra.sample;

import java.util.stream.Stream;

public class StreamOfSample{


public static void main (String[] args){

    Stream.of("Monday","Tused","Wens").filter(s -> s.startsWith("T"))
            .forEach(s -> System.out.println("Matching String: "+s));


}


}