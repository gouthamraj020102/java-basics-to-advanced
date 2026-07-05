package com.javaconcepts.classes.abstractclass;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Audi and call its LuxuryCar methods
        LuxuryCar audi = new Audi(15);
        audi.pressBreak();
        audi.pressDualBreakSystem();

        System.out.println("Number of wheels: " + audi.getNumberOfWheels());

        Car car = new Audi(10);
        car.pressBreak();
        car.pressClutch();

        System.out.println("Number of wheels: " + car.getNumberOfWheels());
    }
}
