package com.javaconcepts.interfaces.java8and9.defaultm.multipleinheritance;

public interface Bird {
    default boolean canBreathe() {
        return true;
    }
}
