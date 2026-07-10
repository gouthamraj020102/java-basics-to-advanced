package com.javaconcepts.interfaces.defaultmethod.multipleinheritance;

public interface LivingThing {
    default boolean canBreathe() {
        return true;
    }
}
