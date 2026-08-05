package com.javaconcepts.controlflow.decisionmaking.ifelse;

public class Main {
    public static void main(String[] args) {
        int number = 7;

        if (number > 8) {
            System.out.println("only get executes when val is greater than 8 ");
        } else {
            System.out.println("this code will executes, if val is less than or equal to 8 ");
        }
        System.out.println("this code will executes, no matter condition is true or false ");
    }
}
