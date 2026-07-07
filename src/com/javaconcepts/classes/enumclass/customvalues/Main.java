package com.javaconcepts.classes.enumclass.customvalues;

// 2. Enum with Custom Values and Methods
public class Main {
    public static void main(String args[]) {

        System.out.println("\nEnum with Custom Values and Methods");
        CustomEnumSample customEnumVariable = CustomEnumSample.getEnumByValue(107);

        System.out.println(customEnumVariable.name() + " has value " + customEnumVariable.getVal() + " and comment: " + customEnumVariable.getComment());
    }
}
