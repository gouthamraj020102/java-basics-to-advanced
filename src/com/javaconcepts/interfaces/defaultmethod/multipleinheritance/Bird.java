package com.javaconcepts.interfaces.defaultmethod.multipleinheritance;

public interface Bird {
    default boolean canBreathe() {
        return true;
    }
}
