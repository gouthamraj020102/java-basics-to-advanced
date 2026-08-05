package com.javaconcepts.controlflow.decisionmaking.switchexpression;

// Java 12 feature: Switch Expressions
public class Main {
    public static void main(String[] args) {
        switchExpressionWithCaseValues();
        switchExpressionUsageOfYield();
    }

    // Use of "case N -> " syntax in switch expression
    public static void switchExpressionWithCaseValues() {
        int val = 1;
        String outputVal = switch (val) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "None";
        };
        System.out.println(outputVal);
    }

    // Use of "yield" keyword in switch expression
    public static void switchExpressionUsageOfYield() {
        int val = 1;
        String outputVal = switch (val) {
            case 1 -> {
                System.out.println("Inside case 1");
                yield "One";
            }
            case 2 -> {
                System.out.println("Inside case 2");
                yield "Two";
            }
            default -> "None";
        };
        System.out.println(outputVal);
    }
}
