package com.javaconcepts.classes.genericclass.genericmethods;

public class Print {

    // Generic Method with one Generic Type
    public <T> void setValue(T object) {
        System.out.println("Value: " + object);
    }

}
