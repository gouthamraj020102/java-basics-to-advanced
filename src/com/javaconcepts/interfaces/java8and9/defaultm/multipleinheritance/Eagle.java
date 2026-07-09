package com.javaconcepts.interfaces.java8and9.defaultm.multipleinheritance;

// It must override the canBreathe() method in this class, as it's been declared in both the interface classes
public class Eagle implements Bird, LivingThing {
    @Override
    public boolean canBreathe() {
        return true;
    }
}
