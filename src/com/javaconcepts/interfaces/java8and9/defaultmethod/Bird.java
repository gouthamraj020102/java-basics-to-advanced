package com.javaconcepts.interfaces.java8and9.defaultmethod;

public interface Bird {
    public void canFly();

    // new common default method implementation
    default int getMinimumFlyHeight() {
        return 100;
    }
}
