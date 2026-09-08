package com.javaconcepts.collections.collectionspart3.list.vector;

import java.util.Vector;

// Vector is a thread-safe, synchronized List implementation.
public class Main {
    public static void main(String[] args) {
        Vector<Integer> obj = new Vector<>();
        obj.add(0, 200);
        System.out.println("Vector element at index 0: " + obj.get(0));
    }
}
