package com.javaconcepts.exceptionhandling.exceptions.checkedexceptions.handling.usingfinally;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        exampleOfUsingFinallyBlock();

        // way1: try-catch-finally block
        usingTryCatchFinallyBlock();

        // way2: try-finally block for checked exception, but we need to declare the exception in method signature
        try {
            usingTryFinallyBlockForCheckedException();
        } catch (ClassNotFoundException e) {
            System.err.println("Way2: ClassNotFoundException occurred");
        }

        // way3: try-finally block for unchecked exception, but we don't need to declare the exception in method signature
        try {
            usingTryFinallyBlockForUncheckedException();
        } catch (NullPointerException e) {
            System.err.println("Way3: NullPointerException occurred");
        }

    }

    private static void exampleOfUsingFinallyBlock() {
        try {
            System.out.println("Example: Inside try block");
            return;
        } finally {
            System.out.println("Example: Finally block executed");
        }
    }

    private static void usingTryCatchFinallyBlock() {
        try {
            method1("dummy");
        } catch (ClassNotFoundException e) {
            System.err.println("Way1: ClassNotFoundException occurred");
        } finally {
            System.out.println("Way1: Finally block executed");
        }
    }

    public static void usingTryFinallyBlockForCheckedException() throws ClassNotFoundException {
        try {
            method1("dummy");
        } finally {
            System.out.println("Way2: Finally block executed");
        }
    }

    public static void usingTryFinallyBlockForUncheckedException() {
        try {
            method2("dummy");
        } finally {
            System.out.println("Way3: Finally block executed");
        }
    }

    // method1 is a checked exception, so we need to declare the exception in method signature
    public static void method1(String name) throws ClassNotFoundException {
        if(name.equals("dummy")) {
            throw new ClassNotFoundException();
        }
    }

    // method2 is an unchecked exception, so we don't need to declare the exception in method signature
    public static void method2(String name) {
        if(name.equals("dummy")) {
            throw new NullPointerException();
        }
    }
}
