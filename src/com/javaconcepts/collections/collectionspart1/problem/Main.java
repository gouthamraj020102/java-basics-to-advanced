package com.javaconcepts.collections.collectionspart1.problem;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[4];
        // insert an element into an array
        arr[0] = 1;
        // get front element
        int val1 = arr[0];
        System.out.println(val1);

        Vector<Integer> vectorObIntegers = new Vector();
        // insert an element in vector
        vectorObIntegers.add(1);
        // get element
        int val2 = vectorObIntegers.get(0);
        System.out.println(val2);
    }
}
