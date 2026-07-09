package com.javaconcepts.interfaces.java8and9.defaultm.multipleinheritance;

public interface LivingThing {
    default boolean canBreathe() {
        return true;
    }
}
