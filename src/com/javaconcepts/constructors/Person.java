package com.javaconcepts.constructors;

public class Person {
    int empId;
    Person(int empId) {
        this.empId = empId;
        System.out.println("Person constructor called working with empId: " + empId);
    }
}
