package com.javaconcepts.classes.nestedclass.nonstaticnested.anonymousinnerclass;

public class Main {
    public static void main(String[] args) {
        Car audiCarObj = new Car() {
            @Override
            public void pressBreak() {
                System.out.println("Audi Specific Break Changes!");
            }
        };
        audiCarObj.pressBreak();
    }
}
