package com.javaconcepts.oops.abstraction;

public class Audi implements Car {
    public void applyBrake() {
        System.out.println("Audi braking system activated");
    }

    public void pressAccelerator() {
        System.out.println("Audi accelerating powerfully");
    }

    public void pressHorn() {
        System.out.println("Audi horn sound");
    }
}