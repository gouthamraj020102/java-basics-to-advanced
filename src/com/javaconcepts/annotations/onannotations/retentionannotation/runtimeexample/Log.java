package com.javaconcepts.annotations.onannotations.retentionannotation.runtimeexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Log {
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumbersList) {
        Object[] objectList = logNumbersList;
        System.out.println(Arrays.toString(objectList));

        List<String> stringValuesList = new ArrayList<>();
        stringValuesList.add("Hello");
        objectList[0] = stringValuesList;
        System.out.println(Arrays.toString(objectList));
    }
}
