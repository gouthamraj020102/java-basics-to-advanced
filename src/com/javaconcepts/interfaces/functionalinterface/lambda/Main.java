package com.javaconcepts.interfaces.functionalinterface.lambda;

import com.javaconcepts.interfaces.functionalinterface.Bird;

public class Main {
    public static void main(String[] args) {

        // Example of a one-line lambda expression
        Bird eagleObject = (String value) -> System.out.println("Eagle Bird Implementation");
        eagleObject.canFly("vertical");

        System.out.println("---------------");

        // Example of a multi-line lambda expression
        Bird eagleObj = (String value) -> {
            System.out.println("Eagle Bird Implementation");
        };
        eagleObj.canFly("vertical");
    }
}
