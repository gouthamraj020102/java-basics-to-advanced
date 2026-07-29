package com.javaconcepts.exceptionhandling.errors.stackoverflowerror;

public class Main {
    public static void main(String[] args) {

        // 2. StackOverflowError when the Java Stack space is full
        recursion(5);

    }

    public static void recursion(int n) {
        if(n > 0) {
            recursion(++n);
        }
    }
}
