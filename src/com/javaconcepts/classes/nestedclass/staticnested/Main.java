package com.javaconcepts.classes.nestedclass.staticnested;

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();

        OuterClass outerObject = new OuterClass();
        outerObject.display();
    }
}
