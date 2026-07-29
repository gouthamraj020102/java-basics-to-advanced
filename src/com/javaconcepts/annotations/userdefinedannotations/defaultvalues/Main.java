package com.javaconcepts.annotations.userdefinedannotations.defaultvalues;

public class Main {
    public static void main(String[] args) {
        MyCustomAnnotation annotation = new Eagle().getClass().getAnnotation(MyCustomAnnotation.class);
        System.out.println(annotation.name());
    }
}
