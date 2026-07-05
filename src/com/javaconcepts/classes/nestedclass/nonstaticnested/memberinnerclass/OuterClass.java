package com.javaconcepts.classes.nestedclass.nonstaticnested.memberinnerclass;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;
    class InnerClass {
        public void print() {
            System.out.println("Non-Static Nested Class");
            System.out.println(classVariable + instanceVariable);
        }
    }
}
