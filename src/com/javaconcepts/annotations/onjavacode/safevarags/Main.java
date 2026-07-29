package com.javaconcepts.annotations.onjavacode.safevarags;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerList2 = new ArrayList<>();
        integerList1.add(100);
        integerList2.add(100);
        integerList2.add(250);
        Log.printLogValues(integerList1, integerList2);
    }
}
