package com.javaconcepts.controlflow.decisionmaking.ifelseif;

public class Main {
    public static void main(String[] args) {
        int val = 13;

        if (val == 1) {
            System.out.println("val is 1");
        } else if (val == 2) {
            System.out.println("val is 2");
        } else if (val == 3) {
            System.out.println("val is 3");
        } else {
            System.out.println("val is: " + val);
        }
        System.out.println("this code will executes anyhow");
    }
}
