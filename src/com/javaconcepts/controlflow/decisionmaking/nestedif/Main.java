package com.javaconcepts.controlflow.decisionmaking.nestedif;

public class Main {
    public static void main(String[] args) {
        int val = 13;

        if (val > 8) {
            System.out.println("value is greater than 8 ");

            if (val < 15) {
                System.out.println("value is greater than 8 but less than 15 ");
            } else {
                System.out.println("value is greater than 15 ");
            }
        } else {
            System.out.println("value is less than equal to 8 ");
        }
        System.out.println("this code will executes anyhow");
    }
}
