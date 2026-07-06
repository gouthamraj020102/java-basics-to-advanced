package com.javaconcepts.classes.genericclass.fundamentals;

import com.javaconcepts.classes.genericclass.Pair;
import com.javaconcepts.classes.genericclass.Print;

public class Main {
    public static void main(String[] args) {
        // Without Generics need to cast the value to the appropriate type
        PrintWithoutGenerics printObject = new PrintWithoutGenerics();
        printObject.setPrintValue(100);
        Object printValue = printObject.getPrintValue();
        if ((int) printValue == 100) {
            System.out.println("Print value is 100");
        }

        // With Generics
        Print<Integer> printObjectWithGenerics = new Print<>();
        printObjectWithGenerics.setPrintValue(110);
        Integer printValueWithGenerics = printObjectWithGenerics.getPrintValue();
        if (printValueWithGenerics == 110) {
            System.out.println("Print value is 110");
        }

        // More than one Generic Type
        Pair<String, Integer> pair = new Pair<>();
        pair.put("Hello", 1010);
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}
