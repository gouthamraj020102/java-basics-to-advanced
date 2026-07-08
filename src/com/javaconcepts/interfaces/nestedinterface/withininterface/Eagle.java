package com.javaconcepts.interfaces.nestedinterface.withininterface;

public class Eagle implements Bird, Bird.NonFlyingBird {
    @Override
    public void canRun() {
        // Implementation goes here
        System.out.println("Run!");
    }

    @Override
    public void canFly() {
        // Implementation goes here
        System.out.println("Fly!");
    }
}
