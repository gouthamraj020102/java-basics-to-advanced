package com.javaconcepts.collections.collectionspart1.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(2);
        values.add(4);

        System.out.println("max value: " + Collections.max(values));
        System.out.println("min value: " + Collections.min(values));
        Collections.sort(values);
        System.out.println("sorted");
        values.forEach((Integer val) -> System.out.println(val));
    }
}
