package com.javaconcepts.oops.abstraction;

public class Audi implements Car {
    @Override
    public void applyBrake() {
        System.out.println("Audi braking system activated");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Audi accelerating powerfully");
    }

    @Override
    public void pressHorn() {
        System.out.println("Audi horn sound");
    }
}