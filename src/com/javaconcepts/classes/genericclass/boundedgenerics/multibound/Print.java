package com.javaconcepts.classes.genericclass.boundedgenerics.multibound;

// T is a generic type parameter
// It is not allowed to be just any type
// It must satisfy all of these constraints:
// 1) it must extend ParentClass
// 2) it must implement Interface1
// 3) it must implement Interface2

// In Java, a type parameter can have:
// - one class bound (must come first)
// - many interface bounds
// This is called a multi-bound generic type

public class Print<T extends ParentClass & Interface1 & Interface2> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void printDetails() {
        if (value == null) {
            System.out.println("No value assigned");
            return;
        }

        value.parentBehavior();
        value.featureOne();
        value.featureTwo();
    }
}
