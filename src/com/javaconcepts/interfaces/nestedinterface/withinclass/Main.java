package com.javaconcepts.interfaces.nestedinterface.withinclass;

public class Main {
    public static void main(String[] args) {
        Bird.NonFlyingBird oNonFlyingBird = new Eagle();
        oNonFlyingBird.canRun();
    }
}
