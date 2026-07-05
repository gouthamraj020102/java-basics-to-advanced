package com.javaconcepts.classes.nestedclass.inheritanceinnested.exampletwo;

public class SomeOtherClass extends OuterClass.InnerClass {
    public void display() {
        System.out.println("inside SomeOtherClass");
        super.display();
    }
    
}
