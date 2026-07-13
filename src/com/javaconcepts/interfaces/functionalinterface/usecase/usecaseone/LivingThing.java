package com.javaconcepts.interfaces.functionalinterface.usecase.usecaseone;

public interface LivingThing {
    default public boolean canBreathe() {
        System.out.println("Breathing!");
        return true;
    }
}
