package com.javaconcepts.classes.enumclass.methodoverride;

// 3. Method overriding in enum class
public class Main {
    public static void main(String[] args) {
        EnumSample fridayEnumSample = EnumSample.FRIDAY;
        fridayEnumSample.dummyMethod();

        EnumSample mondayEnumSample = EnumSample.MONDAY;
        mondayEnumSample.dummyMethod();
    }
}
