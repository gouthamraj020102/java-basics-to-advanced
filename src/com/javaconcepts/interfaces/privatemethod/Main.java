package com.javaconcepts.interfaces.privatemethod;

public class Main {
    public static void main(String[] args) {
        Bird birdObject = new Eagle();
        birdObject.canFly();

        birdObject.minimumFlyingHeight();
        System.out.println("------------------------------");
        Bird.myStaticPublicMethod();
    }
}
