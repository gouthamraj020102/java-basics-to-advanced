package com.javaconcepts.exceptionhandling.errors.outofmemoryerror;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. OutOfMemoryError when the Java Heap space is full
        String arr[] = new String[900000000];
        System.out.println(Arrays.toString(arr));

    }
}