package com.javaconcepts.annotations.onjavacode.safevarags;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Log {
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumberList) {
        Object[] objectList = logNumberList;
        System.out.println("Before: " +Arrays.toString(objectList));

        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("Hello");
        objectList[0] = stringValuesList;
        System.out.println("After: " +Arrays.toString(objectList));
    }

}
