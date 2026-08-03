package com.javaconcepts.exceptionhandling.exceptions.uncheckedexceptions.classcastexception;

public class Main {
    public static void main(String[] args) {
        // 1. ClassCastException
        Object val = 0;
        System.out.println((String) val);
    }
}
