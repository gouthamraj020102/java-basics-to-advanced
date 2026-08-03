package com.javaconcepts.exceptionhandling.exceptions;

// Exception example:
public class Main {
    public static void main(String[] args) {
        Main sampleObject = new Main();
        sampleObject.method1();
    }

    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public void method3() {
        int b = 5/0;
        System.out.println(b);
    }
}
