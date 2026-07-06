package com.javaconcepts.classes.genericclass.boundedgenerics.multibound;

public class A extends ParentClass implements Interface1, Interface2 {

    @Override
    public void parentBehavior() {
        System.out.println(" inherited parent behavior");
    }

    @Override
    public void featureOne() {
        System.out.println(" supports feature one");
    }

    @Override
    public void featureTwo() {
        System.out.println(" supports feature two");
    }
}
