package com.javaconcepts.annotations.onannotations.retentionannotation.runtimeexample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1050);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2050);
        list2.add(3050);
        Log.printLogValues(list1, list2);
    }
}
