package com.javaconcepts.interfaces.implementation;

// Example of Abstract Class implementation of Interface
public abstract class Eagle implements Bird {
    @Override
    public void canFly() {
        // Implementation goes here
        System.out.println("Eagle - Flying");
    }
    public abstract void beakLength();
}
