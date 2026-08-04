package com.javaconcepts.operators.logicaloperators;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;

        // AND Operator
        System.out.println(a < 3 && a != b);
        System.out.println(a > 3 && a != b);

        // OR Operator
        System.out.println(a < 3 || a != b);
        System.out.println(a > 3 || a != b);
    }
}
