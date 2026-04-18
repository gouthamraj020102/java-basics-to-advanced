package com.javaconcepts.oops.abstraction;

public class BMW implements Car {
    public void applyBrake() {
        System.out.println("BMW braking system activated");
    }

    public void pressAccelerator() {
        System.out.println("BMW accelerating smoothly");
    }

    public void pressHorn() {
        System.out.println("BMW horn sound");
    }
}