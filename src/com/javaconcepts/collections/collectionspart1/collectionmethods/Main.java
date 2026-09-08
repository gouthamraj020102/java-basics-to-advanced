package com.javaconcepts.collections.collectionspart1.collectionmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);

        // size
        System.out.println("size: " + values.size());

        // isEmpty
        System.out.println("isEmpty: " + values.isEmpty());

        // contains
        System.out.println("contains: " + values.contains(5));

        // add
        values.add(5);
        System.out.println("added: " + values.contains(5));

        // remove using index
        values.remove(3);
        System.out.println("removed using index: " + values.contains(5));

        // remove using Object, removes the first occurrence of the value
        values.remove(Integer.valueOf(3));
        System.out.println("removed using object: " + values.contains(3));

        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        // addAll
        values.addAll(stackValues);
        System.out.println("addAll test using containsAll: " + values.containsAll(stackValues));

        // containsAll
        values.remove(Integer.valueOf(7));
        System.out.println("containsAll after removing 1 element: " + values.containsAll(stackValues));

        // removeAll
        values.removeAll(stackValues);
        System.out.println("removeAll: " + values.contains(8));

        // clear
        values.clear();
        System.out.println("clear: " + values.isEmpty());
    }
}
