package com.javaconcepts.interfaces.nestedinterface.withininterface;

// Interface within Interface
public interface Bird {
    public void canFly();

    public interface NonFlyingBird {
        public void canRun();
    }
}
