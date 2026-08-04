package com.javaconcepts.operators.operatorprecedence;

public class Main {
    public static void main(String[] args) {
        int result1 = 5 + 2 * 3; // multiplication has higher precedence than addition, so 2*3 is evaluated first: 5 + 6 = 11
        System.out.println(result1);

        int result2 = 5 * 2 / 2; // multiplication and division have equal precedence and are evaluated left to right: 10/2 = 5
        System.out.println(result2);

        int a, b, c;
        a = b = c = 10; // assignment is right-associative: c=10, then b=c, then a=b
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        int x = 4;
        int result = x + x++ + ++x * --x + x--; // operator precedence and evaluation order matter with post/pre increments
        // Breakdown:
        // x (4) + x++ (4, then x becomes 5) + ++x (x becomes 6, value 6) * --x (x becomes 5, value 5) + x-- (5, then x becomes 4)
        // So the expression becomes 4 + 4 + 6*5 + 5 = 4 + 4 + 30 + 5 = 43
        System.out.println(result);
    }
}
