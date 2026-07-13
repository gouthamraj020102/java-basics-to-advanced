package com.javaconcepts.interfaces.functionalinterface.usecase.usecasetwo;

public class Main {
    public static void main(String[] args) {
        LivingThing livingThingObject = () -> true;
        System.out.println(livingThingObject.canBreathe());

        System.out.println("---------------");

        Bird birdObject = new Bird() {
            @Override
            public void canFly(String val) {
                System.out.println("Fly!");
            }

            @Override
            public boolean canBreathe() {
                return false;
            }
        };
        birdObject.canFly("Flying!!!");
        System.out.println(birdObject.canBreathe());
    }
}
