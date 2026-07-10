package com.javaconcepts.interfaces.defaultmethod.extendinterface.wayone;

public interface LivingThing {
    default boolean canBreathe() {
        return true;
    }
}
