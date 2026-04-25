package com.javaconcepts.core.variables;

public class Employee {
    byte var; //class member variable

    public void getDummyData() {
        byte localVar = 10; //local variable
        System.out.println("Class member variable: " + var);
        System.out.println("Local variable: " + localVar);
    }
}
