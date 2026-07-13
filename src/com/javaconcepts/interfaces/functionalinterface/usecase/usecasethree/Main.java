package com.javaconcepts.interfaces.functionalinterface.usecase.usecasethree;

public class Main {
    public static void main(String[] args) {
        Bird eagle = () -> true;
        System.out.println(eagle.canBreathe());
    }
}
