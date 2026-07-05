package com.javaconcepts.classes.abstractclass;

public class Audi extends LuxuryCar {
    public Audi(int mileage) {
        super(mileage);
    }

    @Override
    public void pressClutch() {
        // implementation of it goes here
        System.out.println("Luxury car clutch pressed");
    }

    @Override
    public void pressDualBreakSystem() {
        // implementation of it goes here
        System.out.println("Audi dual break system pressed");
    }

    // Override the pressBreak method to provide a specific implementation for Audi
    @Override
    public void pressBreak() {
        // Call the superclass method to maintain the behavior of LuxuryCar
        super.pressBreak();
        System.out.println("Audi break pressed");
    }
}
