package com.javaconcepts.controlflow.branching.breakstatement;

public class Main {
    public static void main(String[] args) {
        example1();
        example2();
    }

    public static void example1() {
        for (int val = 1; val <= 10; val++) {
            if (val == 3) {
                break;
            }
            System.out.println(val);
        }
    }

    public static void example2() {
        for (int outerLoop = 1; outerLoop <= 5; outerLoop++) {
            for (int innerLoop = 1; innerLoop <= 5; innerLoop++) {
                if (innerLoop == 2) {
                    break;
                }
                System.out.println(outerLoop + "," + innerLoop);
            }
        }
    }
}
