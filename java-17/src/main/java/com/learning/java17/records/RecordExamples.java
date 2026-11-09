package com.learning.java17.records;

public class RecordExamples {
    record Employee(int id, String name) {}

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Alex");

        System.out.println(employee.id());
        System.out.println(employee.name());
    }
}
