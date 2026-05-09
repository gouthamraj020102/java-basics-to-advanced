package com.javaconcepts.methods;

public class Calculation {

    int scalePrice = 10;
    static int penPrice = 5;

    // Method to sum two integers and return the result
    // Parameters are the list of variables used in this method: int a, int b
    public int sum(int a, int b) {
        int total = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + total);
        return total;
    }

    // Method to calculate the price of a pen by summing the price of the cap and the pen body
    // Parameter list can be blank too
    public int getPriceOfPen() {
        int capPrice = 2;
        int penBodyPrice = 5;
        int totalPenPrice = sum(capPrice, penBodyPrice);
        return totalPenPrice;
    }

    // Method to calculate the combined age of two sisters by summing their ages
    public int getCombinedAge() {
        int youngerSisterAge = 19;
        int olderSisterAge = 21;
        int combinedAge = sum(youngerSisterAge, olderSisterAge);
        System.out.println("Combined age of younger and older sister is: " + combinedAge);
        return combinedAge;
    }

    // System-defined method to calculate the square root of a variable using the Math class
    public double squareRootOfVariable(double variable) {
        return Math.sqrt(variable);
    }

    // Overloaded method to sum three integers and return the result
    int sum(int a, int b, int c) {
        int total = a + b + c;
        System.out.println("Sum of " + a + ", " + b + ", and " + c + " is: " + total);
        return total;
    }

    // In Overloading, it do not consider the return type of the method, it only considers the method name and the parameter list to differentiate between overloaded methods.
    // So, we can have multiple methods with the same name but different parameter lists, and they can have different return types as well.
    void sum(int a, int b, int c, int d) {
        int total = a + b + c + d;
        System.out.println("Sum of " + a + ", " + b + ", " + c + ", and " + d + " is: " + total);
    }

    void sumOfNumbers(int ...var) {
        int total = 0;
        for (int i : var) {
            total = total + i;
        }
        System.out.println("Sum of the provided values is: " + total);
    }

    void sumOfNumbersWithDefaultValue(double a, int ...var) {
        double total = a;
        for (int i : var) {
            total = total + i;
        }
        System.out.println("Sum of the provided values is: " + total);
    }

    // Static method to calculate the price of a pencil box by summing the price of a pencil and an eraser
    public static int getPriceOfPencilBox() {
        int pencilPrice = 15;
        int eraser = 5;
        int totalPencilBoxPrice = pencilPrice + eraser;
        totalPencilBoxPrice = totalPencilBoxPrice + penPrice; // Accessing static variable penPrice from the static method
        // totalPencilBoxPrice = totalPencilBoxPrice + scalePrice; // Accessing instance variable scalePrice from the static method will cause an error because static methods cannot access instance variables directly
        return totalPencilBoxPrice;
    }

    public void print() {
        penPrice = 10; // Accessing static variable penPrice from an instance method
        scalePrice = 20; // Accessing instance variable scalePrice from an instance method
        System.out.println("Price of pen: " + penPrice);
        System.out.println("Price of scale: " + scalePrice);
    }
}
