package com.javaconcepts.interfaces.java8and9.problem;

public interface Bird {
    public void canFly();

    // Any new method added in the interface
    // means need to change in all its implementation
    public int getMinimumFlyHeight();
}
