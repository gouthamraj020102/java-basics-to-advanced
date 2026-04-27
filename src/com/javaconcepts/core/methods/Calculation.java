package com.javaconcepts.core.methods;

public class Calculation {

    // Method to sum two integers and return the result
    public int sum(int a, int b) {
        int total = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + total);
        return total;
    }

    // Method to calculate the price of a pen by summing the price of the cap and the pen body
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
}
