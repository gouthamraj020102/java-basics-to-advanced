package com.javaconcepts.controlflow.decisionmaking.switchstatement;

public class Main {
    public static void main(String[] args) {

        // Examples:
        switchStatementWithBreak();
        System.out.println("--------------");

        switchStatementWithoutBreak();
        System.out.println("--------------");

        switchStatementWithDefaultNotAtEnd();
        System.out.println("--------------");

        switchStatementWithoutBreakAndDefaultNotAtEnd();
        System.out.println("--------------");

        switchStatementWithMultiLineCases();
        System.out.println("--------------");

        switchStatementWithSingleLineCases();
        System.out.println("--------------");

        // Few things we need to take care:
        switchStatementShouldBeLiteralOrConstant();
        System.out.println("--------------");

        switchStatementCasesOptional();
        System.out.println("--------------");

        switchStatementWithNestedSwitch();
        System.out.println("--------------");

    }


    // Example 1: Switch statement with break
    public static void switchStatementWithBreak() {
        int a = 1;
        int b = 2;
        switch(a + b) {
            case 1:
                System.out.println("a + b is 1");
                break;
            case 2:
                System.out.println("a + b is 2");
                break;
            case 3:
                System.out.println("a + b is 3");
                break;
            default:
                System.out.println(a + b);
        }
    }

    // Example 2: Switch statement without break
    public static void switchStatementWithoutBreak() {
        int a = 1;
        int b = 2;
        switch(a + b) {
            case 1:
                System.out.println("a + b is 1");
                break;
            case 2:
                System.out.println("a + b is 2");
                break;
            case 3:
                System.out.println("a + b is 3");
            case 4:
                System.out.println("a + b is 4");
            default:
                System.out.println(a + b);
        }
    }

    // Example 3: Switch statement with default in the middle
    public static void switchStatementWithDefaultNotAtEnd() {
        int a = 1;
        int b = 2;
        switch(a + b) {
            case 1:
                System.out.println("a + b is 1");
                break;
            default:
                System.out.println(a + b);
            case 2:
                System.out.println("a + b is 2");
                break;
            case 3:
                System.out.println("a + b is 3");
            case 4:
                System.out.println("a + b is 4");
        }
    }

    // Example 4: Switch statement with default in the middle with no break
    public static void switchStatementWithoutBreakAndDefaultNotAtEnd() {
        int a = 1;
        int b = 9;
        switch (a + b) {
            case 1:
                System.out.println("a + b is 1");
                break;
            default:
                System.out.println(a + b);
            case 2:
                System.out.println("a + b is 2");
                break;
            case 3:
                System.out.println("a + b is 3");
            case 4:
                System.out.println("a + b is 4");
        }
    }

    // Example 5: Switch statement with Multi-Line Cases
    public static void switchStatementWithMultiLineCases() {
        String month = "March";
        switch(month) {
            case "January":
            case "February":
            case "March":
                System.out.println("month value is in Q1");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println("month value is in Q2");
                break;
            default:
                System.out.println("month value is in Q3 or Q4");
        }
    }

    // Example 6: Switch statement with Single-Line Cases
    public static void switchStatementWithSingleLineCases() {
        String month = "March";
        switch(month) {
            case "January", "February", "March":
                System.out.println("month value is in Q1");
                break;
            case "April", "May", "June":
                System.out.println("month value is in Q2");
                break;
            default:
                System.out.println("month value is in Q3 or Q4");
        }
    }

    // Point 3: Case value should be either Literal or Constant
    public static void switchStatementShouldBeLiteralOrConstant() {
        final int value = 1;
        switch (2 + 1 - 2) {
            case value:
                System.out.println("Some code here");
            default:
                System.out.println("Default code here");
        }
    }

    // Point 4: All use case need not to be handled
    public static void switchStatementCasesOptional() {
        Day dayEnumVal = Day.FRIDAY;
        int outputValue = 0;
        switch(dayEnumVal) {
            case MONDAY:
                outputValue = 1;
                break;
            case TUESDAY:
                outputValue = 2;
                break;
            case WEDNESDAY:
                outputValue = 3;
                break;
            case THURSDAY:
                outputValue = 4;
                break;
        }
        System.out.println(outputValue);
    }

    // Point 5: Nested Switch statement is possible:
    public static void switchStatementWithNestedSwitch() {
        Day dayEnumVal = Day.MONDAY;
        int outputValue = 0;
        switch(dayEnumVal) {
            case MONDAY:
                outputValue = 1;
                switch(outputValue) {
                    case 1:
                        System.out.println("output value:" + 1);
                        break;
                    case 2:
                        System.out.println("output value:" + 2);
                        break;
                    default:
                        System.out.println("output value:" + outputValue);
                }
                break;
            case TUESDAY:
                outputValue = 2;
                break;
            case WEDNESDAY:
                outputValue = 3;
                break;
            case THURSDAY:
                outputValue = 4;
                break;
        }
        System.out.println(outputValue);
    }
}
