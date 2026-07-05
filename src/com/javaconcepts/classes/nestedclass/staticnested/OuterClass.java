package com.javaconcepts.classes.nestedclass.staticnested;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    // Using default static nested class
    static class StaticNestedClass {
        public void display() {

            System.out.println("Static Nested Class");

            // Error: Cannot access instanceVariable from static context
            // System.out.println(classVariable + instanceVariable);

            System.out.println(classVariable);
        }
    }

    // Using private static nested class
    private static class NestedClass {
        public void print() {
            System.out.println("Private Static Nested Class");
            System.out.println(classVariable);
        }
    }

    public void display() {
        NestedClass nested = new NestedClass();
        nested.print();
    }
}
