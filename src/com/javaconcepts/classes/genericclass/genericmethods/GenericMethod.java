package com.javaconcepts.classes.genericclass.genericmethods;

import com.javaconcepts.classes.genericclass.Pair;

public class GenericMethod {

    // Generic Method with more than one Generic Type
    public <K, V> void printValue(Pair<K, V> pair1, Pair<K, V> pair2) {
        if (pair1.getKey().equals(pair2.getKey())) {
            System.out.println("Both pairs are equal");
        } else {
            System.out.println("Both pairs are not equal");
        }
    }

}
