package com.javaconcepts.classes.nestedclass.inheritanceinnested.exampleone;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClassObj = new OuterClass();
        OuterClass.InnerClass2 innerClass2Obj = outerClassObj.new InnerClass2();
        innerClass2Obj.display();
    }
}
