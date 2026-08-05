package com.javaconcepts.controlflow.iterative.forloop;

public class Main {
    public static void main(String[] args) {
        forLoopExample1();
        forLoopExample2();
    }

    // Example 1: Basic For loop
    public static void forLoopExample1() {
        for (int val = 1; val <= 10; val++) {
            System.out.println(val);
        }
    }

    // Example 2: Multiple for loops i.e., Nested For loop
    public static void forLoopExample2() {
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                System.out.println("x=" + x + " : y=" + y);
            }
        }
    }
}
