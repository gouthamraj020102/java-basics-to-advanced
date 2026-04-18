package com.javaconcepts.fundamentals;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student(20, "Java Lane");

        // Accessing data through methods
        System.out.println("Current Age: " + student.getAge());
        System.out.println("Current Address: " + student.getAddress());
    }
}
