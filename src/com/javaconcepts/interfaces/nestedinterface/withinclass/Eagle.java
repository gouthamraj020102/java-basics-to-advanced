package com.javaconcepts.interfaces.nestedinterface.withinclass;

public class Eagle implements Bird.NonFlyingBird {
    @Override
    public void canRun() {
        System.out.println("Running!");
    }
}
