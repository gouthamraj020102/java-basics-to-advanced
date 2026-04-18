package com.javaconcepts.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        // Allowable because Car is a subclass of Vehicle
        Car swift = new Car();
        swift.getEngine();
        swift.getCarType();

        // Not allowable because Vehicle is a superclass of Car
        Vehicle vehicle = new Vehicle();
        // vehicle.getCarType();
        vehicle.getEngine();
    }
}