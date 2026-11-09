package com.learning.java11.strings;

public class StringExamples {
    public static void main(String[] args) {
        String value = "  Java 11  ";

        System.out.println(value.strip());
        System.out.println("".isBlank());
        System.out.println("Java".repeat(3));
    }
}
