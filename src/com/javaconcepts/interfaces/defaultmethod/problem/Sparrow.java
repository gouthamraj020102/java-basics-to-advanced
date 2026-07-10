package com.javaconcepts.interfaces.defaultmethod.problem;

public class Sparrow implements Bird {
    @Override
    public void canFly() {
        // sparrow fly logic
    }

    @Override
    public int getMinimumFlyHeight() {
        return 100;
    }
}
