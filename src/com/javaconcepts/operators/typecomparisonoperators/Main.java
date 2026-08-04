package com.javaconcepts.operators.typecomparisonoperators;

public class Main {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass2();
        System.out.println(obj instanceof ParentClass); // true: obj refers to ChildClass2 which extends ParentClass
        System.out.println(obj instanceof ChildClass1); // false: obj is ChildClass2, not ChildClass1

        ChildClass1 childObj = new ChildClass1();
        System.out.println(childObj instanceof ParentClass); // true: ChildClass1 is a subclass of ParentClass

        String val = "Hello";
        System.out.println(val instanceof String); // true: val is a String

        Object unknownObject = new RandomClass();
        System.out.println(unknownObject instanceof ChildClass2); // false: RandomClass is not related to ChildClass2

        ParentClass parentObj = new ParentClass();
        System.out.println(parentObj instanceof ChildClass1); // false: parentObj is a ParentClass instance, not a ChildClass1
    }
}
