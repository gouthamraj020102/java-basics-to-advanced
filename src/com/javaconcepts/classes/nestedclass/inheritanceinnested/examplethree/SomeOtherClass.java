package com.javaconcepts.classes.nestedclass.inheritanceinnested.examplethree;

public class SomeOtherClass extends OuterClass.InnerClass {
    SomeOtherClass() {
        new OuterClass().super();
    }
    public void display() {
        super.display();
    }
}
