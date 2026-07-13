package com.javaconcepts.interfaces.functionalinterface;

// This annotation is optional, but it helps enforce that the interface has only one abstract method
// If another abstract method is added, the compiler will throw an error
@FunctionalInterface
public interface Bird {
    void canFly(String val);

    default void getHeight() {
        System.out.println("Default Method Implementation");
    }

    static void canEat() {
        System.out.println("Static Method Implementation");
    }

    // Object class method
    String toString();
}
