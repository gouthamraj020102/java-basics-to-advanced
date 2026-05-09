package com.javaconcepts.constructors;

public class Manager extends Person {
    int age;
    Manager(int empId, int age) {
        super(empId); // Calls the constructor of the superclass (Person)
        this.age = age;
        System.out.println("Manager constructor called working with empId: " + empId + " and age: " + age);
    }
}
