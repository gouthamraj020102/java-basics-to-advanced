package com.javaconcepts.interfaces.defaultmethod.extendinterface.waythree;

public interface LivingThing {
    default boolean canBreathe() {
        return true;
    }
}
