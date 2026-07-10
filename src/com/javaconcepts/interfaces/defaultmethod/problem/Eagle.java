package com.javaconcepts.interfaces.defaultmethod.problem;

public class Eagle implements Bird {
    @Override
    public void canFly() {
        // eagle fly implementation
    }

    @Override
    public int getMinimumFlyHeight() {
        return 100;
    }
}
