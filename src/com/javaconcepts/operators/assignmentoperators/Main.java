package com.javaconcepts.operators.assignmentoperators;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int variable;

        variable = a;
        System.out.println(variable);

        variable = 0;
        variable += a;
        System.out.println(variable);

        variable -= 3;
        System.out.println(variable);

        variable *= a;
        System.out.println(variable);

        variable /= a;
        System.out.println(variable);
    }
}
