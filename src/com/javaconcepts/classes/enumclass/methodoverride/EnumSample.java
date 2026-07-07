package com.javaconcepts.classes.enumclass.methodoverride;

public enum EnumSample {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("Monday dummy method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod() {
        System.out.println("default dummy method");
    }
}
