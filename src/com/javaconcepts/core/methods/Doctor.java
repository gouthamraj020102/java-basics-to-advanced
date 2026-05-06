package com.javaconcepts.core.methods;

public class Doctor extends Person {

    // @Override annotation is used to indicate that the method is overriding a method from the superclass
    // Can be ignored if not used, but it is a good practice to use it to avoid mistakes and improve code readability
    @Override
    public void profession() {
        System.out.println("I am a doctor");
    }

    public static void additonalDetails() {
        System.out.println("I am in Doctor class");
    }
}
