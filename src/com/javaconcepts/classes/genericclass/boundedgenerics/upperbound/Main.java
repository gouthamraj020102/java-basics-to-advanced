package com.javaconcepts.classes.genericclass.boundedgenerics.upperbound;

public class Main {
    public static void main(String[] args) {

        // Allowed because Integer is a subclass of Number
        Print<Integer> parameterizedPrintObject = new Print<>();
        parameterizedPrintObject.setPrintValue(10);
        System.out.println("Print Integer Value: " + parameterizedPrintObject.getPrintValue());

        // Allowed because Double is a subclass of Number
        Print<Double> parameterizedPrintDouble = new Print<>();
        parameterizedPrintDouble.setPrintValue(20.5);
        System.out.println("Print Double Value: " + parameterizedPrintDouble.getPrintValue());

        // Allowed because Float is a subclass of Number
        Print<Float> parameterizedPrintFloat = new Print<>();
        parameterizedPrintFloat.setPrintValue(30.5f);
        System.out.println("Print Float Value: " + parameterizedPrintFloat.getPrintValue());

        // Not Allowed because String is not a subclass of Number
        // Print<String> parameterizedPrintString = new Print<>();

    }
}
