package com.javaconcepts.interfaces.defaultmethod.extendinterface.waytwo;

public interface LivingThing {
    default boolean canBreathe() {
        return true;
    }
}
