package com.javaconcepts.interfaces.defaultmethod.extendinterface.waythree;

public interface Bird extends LivingThing {
    @Override
    default boolean canBreathe() {
        boolean canBreatheOrNot = LivingThing.super.canBreathe();
        System.out.println("Calls Parent Interface Method");
        return canBreatheOrNot;
    }
}
