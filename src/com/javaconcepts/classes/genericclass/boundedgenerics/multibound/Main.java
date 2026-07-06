package com.javaconcepts.classes.genericclass.boundedgenerics.multibound;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        Print<A> printObj = new Print<>();
        printObj.setValue(a);
        printObj.printDetails();
    }
}
