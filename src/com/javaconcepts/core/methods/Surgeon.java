package com.javaconcepts.core.methods;

public abstract class Surgeon {
    public abstract void performSurgery();

    public final void assistInSurgery() {
        System.out.println("Assisting in surgery");
    }
}
