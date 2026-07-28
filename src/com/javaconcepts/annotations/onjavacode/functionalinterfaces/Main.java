package com.javaconcepts.annotations.onjavacode.functionalinterfaces;

public class Main {

    public static void main(String[] args) {
        Bird birdObject = new Bird() {
            @Override
            public void eat() {
                System.out.println("Bird is Eating");
            }
        };
        birdObject.eat();
    }
}
