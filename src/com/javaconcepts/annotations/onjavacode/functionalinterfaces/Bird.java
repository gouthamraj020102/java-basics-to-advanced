package com.javaconcepts.annotations.onjavacode.functionalinterfaces;

@FunctionalInterface
public interface Bird {

    public void eat();

    // FunctionalInterface annotation resticts to have only 1 abstract method
    // public boolean fly();

}
