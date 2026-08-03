package com.javaconcepts.exceptionhandling.exceptions.checkedexceptions.ways.usingtrycatch;

// Handling the exception using "try/catch" block:
public class Main {
    public static void main(String[] args) {

        // ex: 1
        method1();

        // ex: 2
        try {
            method2();
        } catch (ClassNotFoundException e) {
            System.err.println("Error Occured!");
        }
    }

    public static void method1() {
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void method2() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
