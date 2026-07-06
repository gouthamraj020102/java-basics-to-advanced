package com.javaconcepts.classes.genericclass.genericmethods;

import com.javaconcepts.classes.genericclass.Pair;

public class Main {
    public static void main(String[] args) {

        GenericMethod obj = new GenericMethod();
        Pair<Integer, String> pair1 = new Pair<>(1, "Hello");
        Pair<Integer, String> pair2 = new Pair<>(2, "World");
        obj.printValue(pair1, pair2);
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());

        Print printObj = new Print();
        printObj.setValue("Welcome to the World!");
        printObj.setValue(42);
        printObj.setValue(new Bus());

    }
}
