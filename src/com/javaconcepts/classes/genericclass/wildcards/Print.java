package com.javaconcepts.classes.genericclass.wildcards;

import java.util.List;

public class Print {

    // Upper bound wildcard: accepts Vehicle and its subtypes (Car, Bus)
    // Good for reading values because we know they are at least Vehicle
    public void setUpperBoundPrintValues(List<? extends Vehicle> vehicleList) {
        System.out.println("Upper bound wildcard: list contains Vehicle or its subtypes");
    }

    // Lower bound wildcard: accepts Vehicle and its supertypes (Object, etc.)
    // Good for adding Vehicle or its subtypes because we know the list can hold them
    public void setLowerBoundPrintValues(List<? super Vehicle> vehicleList) {
        System.out.println("Lower bound wildcard: list can hold Vehicle or its supertypes");
    }

    // Wild Card Method
    public void computeList(List<? extends Number> source, List<? extends Number> destination) {
        System.out.println("Wildcard method: works with Number and its subtypes");
    }

    // Generic type Method
    public <T extends Number> void computeList1(List<T> source, List<T> destination) {
        System.out.println("Generic method: source and destination must use the same type");
    }

}
