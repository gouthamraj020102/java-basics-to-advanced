package com.javaconcepts.oops.polymorphism;

public class Sum {
    // Method overloading - same method name with different parameters
    int doSum(int a, int b) {
        return a + b;
    }
    int doSum(int a, int b, int c) {
        return a + b + c;
    }
    String doSum(String a, String b) {
        return a + b;
    }
}
