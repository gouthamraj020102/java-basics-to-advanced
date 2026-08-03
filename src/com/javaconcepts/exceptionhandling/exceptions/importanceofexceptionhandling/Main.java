package com.javaconcepts.exceptionhandling.exceptions.importanceofexceptionhandling;

public class Main {
    public static void main(String[] args) {

        // Advantages of Exception Handling:

        System.out.println("Without Exception Handling::");
        System.err.println("Error Code: " + myMethod1(0, 0));
        System.err.println("Error Code: " + myMethod1(0, 1));
        System.err.println("Error Code: " + myMethod1(1, 0));
        System.err.println("Error Code: " + myMethod1(1, 1));

        System.out.println("With Exception Handling::");
        myMethod2(0);
        myMethod2(1);
        myMethod2(12);


        // Limitations of Exception Handling:

        System.out.println("Limitations of Exception Handling::");
        // Example 2 is better because it avoids relying on an exception for a predictable case, making the code simpler and easier to read when the condition is known beforehand.
        System.out.println("Example 1: " + example1(10, 0));
        System.out.println("Example 2: " + example2(100, 0));
    }

    public static void myMethod(int schoolClassNumber, int noOfStudents) {
        String[] names = new String[noOfStudents];
        names[0] = "new value";
    }

    private static int example1(int a, int b) {
        int val;
        try {
            val = a / b;
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            val = -1;
        }
        return val;
    }

    private static int example2(int a, int b) {
        if (b == 0) {
            return -1;
        }
        int val = a / b;
        return val;
    }

    // Without Exception Handling
    public static int myMethod1(int schoolClassNumber, int noOfStudents) {
        int errorCode = 0;
        if (schoolClassNumber > 0 && schoolClassNumber <= 12) {
            if (noOfStudents > 0) {
                String[] names = new String[noOfStudents];
                if (names != null && names.length > 0) {
                    names[0] = "new value";
                } else {
                    errorCode = -3;
                }
            } else {
                errorCode = -2;
            }
        } else {
            errorCode = -1;
        }
        return errorCode;
    }

    // With Exception Handling
    public static void myMethod2(int schoolClassNumber) {
        try {
            int noOfStudents = getStudentCapacityOfClass(schoolClassNumber);
            String[] names = new String[noOfStudents];
            names[0] = "new value";
            System.out.println("Successfully assigned value to names[0]");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int getStudentCapacityOfClass(int schoolClassNumber) {
        if (schoolClassNumber <= 0 || schoolClassNumber > 12) {
            throw new IllegalArgumentException("Invalid class number: " + schoolClassNumber);
        }
        return schoolClassNumber == 12 ? 30 : 0;
    }
}