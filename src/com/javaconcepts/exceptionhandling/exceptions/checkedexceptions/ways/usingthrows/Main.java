package com.javaconcepts.exceptionhandling.exceptions.checkedexceptions.ways.usingthrows;

// Handling the exception using "throws" keyword:
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
}
