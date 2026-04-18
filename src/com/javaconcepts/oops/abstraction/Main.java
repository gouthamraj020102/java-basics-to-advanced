package com.javaconcepts.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Car car1 = new BMW();
        Car car2 = new Audi();

        car1.pressAccelerator();
        car1.pressHorn();
        car1.applyBrake();

        car2.pressHorn();
        car2.applyBrake();
        car2.pressAccelerator();
    }
}