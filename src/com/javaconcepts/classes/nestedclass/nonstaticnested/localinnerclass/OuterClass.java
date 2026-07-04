package com.javaconcepts.classes.nestedclass.nonstaticnested.localinnerclass;

public class OuterClass {
    int instanceVariable = 1;
    static int classVariable = 2;

    public void display() {
        int methodLocalVariable = 3;

        class LocalInnerClass {
            int localInnerVariable = 4;
            public void print() {
                System.out.println("Instance Variable: " + instanceVariable);
                System.out.println("Class Variable: " + classVariable);
                System.out.println("Method Local Variable: " + methodLocalVariable);
                System.out.println("Local Inner Variable: " + localInnerVariable);
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.print();
    }
}
