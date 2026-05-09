package com.javaconcepts.oops.abstraction;

public class BMW implements Car {
    @Override
    public void applyBrake() {
        System.out.println("BMW braking system activated");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("BMW accelerating smoothly");
    }

    @Override
    public void pressHorn() {
        System.out.println("BMW horn sound");
    }
}