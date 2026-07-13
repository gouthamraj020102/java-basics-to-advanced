package com.javaconcepts.interfaces.functionalinterface.types.function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> integerToString = (Integer num) -> num.toString();
        System.out.println(integerToString.apply(64));

        System.out.println("---------------");

        Function<Integer, String> integerToStringV2 = (Integer num) -> {
            String output = num.toString();
            return output;
        };
        System.out.println(integerToStringV2.apply(14));
    }
}
