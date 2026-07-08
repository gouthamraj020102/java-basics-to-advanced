package com.javaconcepts.interfaces.implementation;

public class WhiteEagle extends Eagle {
    @Override
    public void noOfLegs() {
        // implement interface method
        System.out.println("WhiteEagle - Number of Legs");
    }

    @Override
    public void beakLength() {
        // implementing abstract class method
        System.out.println("WhiteEagle - BeakLength");
    }
}
