package com.javaconcepts.interfaces.functionalinterface.types.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> isEvenNumber = () -> "this is the data i am returning";
        System.out.println(isEvenNumber.get());
    }
}
