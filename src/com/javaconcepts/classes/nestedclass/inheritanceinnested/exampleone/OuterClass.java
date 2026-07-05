package com.javaconcepts.classes.nestedclass.inheritanceinnested.exampleone;

class OuterClass {
    int instanceVariable = 1;
    static int classVariable = 2;
    class InnerClass1 {
        int innerClass1 = 3;
    }
    class InnerClass2 extends InnerClass1 {
        int innerClass2 = 4;
        void display() {
            System.out.println("Instance Variable: " + instanceVariable);
            System.out.println("Class Variable: " + classVariable);
            System.out.println("Inner Class 1 Variable: " + innerClass1);
            System.out.println("Inner Class 2 Variable: " + innerClass2);
        }
    }
}
