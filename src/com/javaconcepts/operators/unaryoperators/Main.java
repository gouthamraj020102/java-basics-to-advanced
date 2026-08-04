package com.javaconcepts.operators.unaryoperators;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        boolean flag = true;

        // Increment operator
        System.out.println(a++);
        System.out.println(++a);

        // Decrement operator
        System.out.println(a--);
        System.out.println(--a);

        // Logical NOT operator
        System.out.println(!flag);

        // Unary minus operator
        System.out.println(-a);

        // Unary plus operator
        System.out.println(+a);
    }
}
