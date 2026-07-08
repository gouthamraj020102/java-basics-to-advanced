package com.javaconcepts.interfaces.nestedinterface.withininterface;

public class Main {
    public static void main(String[] args) {
        Bird oBird = new Eagle();
        oBird.canFly();

        Bird.NonFlyingBird oNonFlyingBird = new Eagle();
        oNonFlyingBird.canRun();
    }
}
