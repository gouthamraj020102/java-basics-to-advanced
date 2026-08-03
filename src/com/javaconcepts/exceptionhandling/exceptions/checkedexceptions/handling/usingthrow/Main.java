package com.javaconcepts.exceptionhandling.exceptions.checkedexceptions.handling.usingthrow;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            method1();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            throw e; // Rethrowing the exception
        }
    }

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException("Class not found exception occurred in method1");
    }
}
