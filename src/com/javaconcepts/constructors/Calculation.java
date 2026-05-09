package com.javaconcepts.constructors;

public class Calculation {
    String name;
    int id;

    // No-arg constructor
    // Private constructor to prevent instantiation from outside the class
    // Constructor chaining example
    private Calculation() {
        this(100); // Calls the constructor with int parameter
    }

    Calculation(int empId) {
        this("Gowtham", empId); // Calls the constructor with String and int parameters
    }

    public static Calculation getInstance() {
        return new Calculation();
    }

    // Parameterized constructor
    public Calculation(String empName) {
        this.name = empName;
    }

    // Constructor overloading with two parameters
    Calculation(String empName, int empId) {
        this.name = empName;
        this.id = empId;
    }
}
