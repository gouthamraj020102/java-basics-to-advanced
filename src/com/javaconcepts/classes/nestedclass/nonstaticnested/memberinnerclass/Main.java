package com.javaconcepts.classes.nestedclass.nonstaticnested.memberinnerclass;

public class Main {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.print();
    }
}
