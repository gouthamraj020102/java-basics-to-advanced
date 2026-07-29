package com.javaconcepts.annotations.userdefinedannotations.emptybody;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Eagle().getClass().getAnnotation(MyCustomAnnotation.class));
    }
}
