package com.javaconcepts.annotations.onannotations.repeatableannotation;


public class Main {
    public static void main(String[] args) {
        Category[] categoryAnnotationArray = new Eagle().getClass().getAnnotationsByType(Category.class);
        for (Category annotation : categoryAnnotationArray) {
            System.out.println(annotation.name());
        }
    }
}
