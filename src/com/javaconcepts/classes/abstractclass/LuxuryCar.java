package com.javaconcepts.classes.abstractclass;

public abstract class LuxuryCar extends Car {
    LuxuryCar(int mileage) {
        super(mileage);
    }

    public abstract void pressDualBreakSystem();

    @Override
    public void pressBreak() {
        // implementation of it goes here
        System.out.println("Luxury car break pressed");
    }
}
