package com.javaconcepts.exceptionhandling.exceptions.userdefinedexceptions;

public class Main {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method1() throws MyCustomException {
        throw new MyCustomException("This is a user-defined exception.");
    }
}
