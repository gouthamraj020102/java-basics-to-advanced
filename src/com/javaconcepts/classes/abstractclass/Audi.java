package com.javaconcepts.classes.abstractclass;

public class Audi extends LuxuryCar {
    Audi(int mileage) {
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
}
