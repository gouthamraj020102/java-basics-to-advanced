package com.javaconcepts.exceptionhandling.exceptions.checkedexceptions.handling.usingtrycatchblock;

public class Main {
    public static void main(String[] args) {

        // way1: Handling checked exceptions using try-catch block
        handleUsingMultipleTryCatch();

        // way2: Catching all Exception Object
        catchAllExceptionObject();

        // way3: Catching multiple exceptions in a single catch block
        catchMultipleExceptions();
    }

    public static void handleUsingMultipleTryCatch() {
        try {
            method1("dummy");
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException occurred");
        } catch (InterruptedException e) {
            System.err.println("InterruptedException occurred");
        }
    }

    public static void catchAllExceptionObject() {
        try {
            method1("interrupted");
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException occurred");
        } catch (Exception e) {
            System.err.println("Exception occurred");
        }
    }

    public static void catchMultipleExceptions() {
        try {
            method1("dummy");
        } catch (ClassNotFoundException | InterruptedException e) {
            System.err.println("ClassNotFoundException or InterruptedException occurred");
        } catch (Exception e) {
            System.err.println("Exception occurred");
        }
    }

    public static void method1(String name) throws ClassNotFoundException, InterruptedException {
        if(name.equals("dummy")) {
            throw new ClassNotFoundException();
        } else if(name.equals("interrupted")) {
            throw new InterruptedException();
        }
    }
}
