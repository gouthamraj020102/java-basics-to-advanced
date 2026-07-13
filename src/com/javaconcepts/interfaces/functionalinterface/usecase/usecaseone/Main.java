package com.javaconcepts.interfaces.functionalinterface.usecase.usecaseone;

public class Main {
    public static void main(String[] args) {
        Bird birdObject = (String val) -> System.out.println("Flying!");
        birdObject.canFly("Hello");
        birdObject.canBreathe();
    }
}
