package com.learning.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sudarshan", "alex", "sam", "john");

        List<String> longNames = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        longNames.forEach(System.out::println);
    }
}
