package com.javaconcepts.controlflow.branching.continuestatement;

public class Main {
    public static void main(String[] args) {
        for (int val = 1; val <= 10; val++) {
            if (val == 3) {
                continue;
            }
            System.out.println(val);
        }
    }
}
