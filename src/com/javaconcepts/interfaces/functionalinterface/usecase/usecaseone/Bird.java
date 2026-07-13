package com.javaconcepts.interfaces.functionalinterface.usecase.usecaseone;

// Functional Interface extends from other interface
@FunctionalInterface
public interface Bird extends LivingThing {
    void canFly(String val);
}
