package com.javaconcepts.operators.ternaryoperators;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        int maxValue = (a > b) ? a : b;

        System.out.println("The maximum value is: " + maxValue);
    }
}
