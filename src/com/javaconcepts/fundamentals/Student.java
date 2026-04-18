package com.javaconcepts.fundamentals;

public class Student {
    // 1. Data Variables
    // These belong to the object, not a specific method.
    private int age;
    private String address;

    // 2. Constructor (Optional but good practice)
    public Student(int age, String address) {
        this.age = age;
        this.address = address;
    }

    // 3. Data Methods (Behaviors)
    // These should be outside of main.
    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public int getAge() {
        return age;
    }

    // 4. The Entry Point
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student myStudent = new Student(20, "123 Java Lane");

        // Accessing data through methods
        System.out.println("Current Age: " + myStudent.getAge());
    }
}