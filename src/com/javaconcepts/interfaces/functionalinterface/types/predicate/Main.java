package com.javaconcepts.interfaces.functionalinterface.types.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer val) -> {
            if (val%2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(isEven.test(36));

        System.out.println("---------------");

        Predicate<Integer> isOdd = (Integer val) -> val%2 != 0;
        System.out.println(isOdd.test(35));
    }
}
