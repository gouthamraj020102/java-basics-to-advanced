package com.javaconcepts.core.variables;

public class Employee {
    byte var; //class member variable

    public void getDummyData() {
        byte localVar = 10; //local variable
        System.out.println("Class member variable: " + var);
        System.out.println("Local variable: " + localVar);
    }

    int memberVariable; //class member or instance variable
    static int staticMemberVariable = 100; //static variable or class variable

    Employee() {}

    // Parameterized constructor
    Employee(int a) {
        System.out.println("Parameterized constructor called with value: " + a);
    }

    public void getAnotherDummyData() {
        int localVariable = 50; //local variable
        System.out.println("Local variable: " + localVariable);
    }

    // method with parameters
    public int getAnotherDummyData2(int a, int b) {
        return a + b;
    }
}
