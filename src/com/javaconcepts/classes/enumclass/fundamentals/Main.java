package com.javaconcepts.classes.enumclass.fundamentals;

// 1. Normal Enum Class declaration and usage
public class Main {
    public static void main(String[] args) {

        /* Common functions which is used
        - values() - returns an array of all enum constants in the order they are declared
        - ordinal() - returns the position of the enum constant in the enum declaration starting from
        - valueOf() - returns the enum constant of the specified enum type with the specified name
        - name() - returns the name of the enum constant as a string
         */

        // Usage of values() and ordinal() methods
        for (EnumSample sample : EnumSample.values()) {
            System.out.println(sample.ordinal() + " - " + sample.name());
        }

        // Usage of valueOf() and name() method
        EnumSample enumVariable = EnumSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name() + " is the " + enumVariable.ordinal() + "th day of the week");

    }
}
