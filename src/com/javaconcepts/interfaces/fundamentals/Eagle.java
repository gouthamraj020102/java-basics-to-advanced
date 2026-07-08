package com.javaconcepts.interfaces.fundamentals;

// 4. Eagle must implement all the inherited abstract methods
public class Eagle implements NonFlyingBird {

    @Override
    public void canRun() {
        System.out.println("Running");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}
