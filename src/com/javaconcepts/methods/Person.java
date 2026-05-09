package com.javaconcepts.methods;

public class Person {
    public void profession() {
        System.out.println("I am a person");
    }

    // Static method to demonstrate method hiding
    // When marked as final, it cannot be overridden in the subclass Person
    public static void additonalDetails() {
        System.out.println("I am in Person class");
    }
}
