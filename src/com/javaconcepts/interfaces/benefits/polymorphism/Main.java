package com.javaconcepts.interfaces.benefits.polymorphism;

public class Main {
    public static void main(String[] args) {
        Bird birdObject1 = new Eagle();
        Bird birdObject2 = new Hen();
        birdObject1.fly();
        birdObject2.fly();
    }
}
