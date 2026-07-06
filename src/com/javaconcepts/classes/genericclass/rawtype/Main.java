package com.javaconcepts.classes.genericclass.rawtype;

import com.javaconcepts.classes.genericclass.Print;

public class Main {
    public static void main(String[] args) {

        // Without using Raw Type
        Print<String> parameterizedTypePrintObject = new Print<>();
        parameterizedTypePrintObject.setPrintValue("Hello World");
        System.out.println(parameterizedTypePrintObject.getPrintValue());

        // Using Raw Type
        // internally it passes Object as parameterized type. Ex: Print<Object> rawTypePrintObject = new Print();
        Print rawTypePrintObject = new Print();
        rawTypePrintObject.setPrintValue(10);
        System.out.println(rawTypePrintObject.getPrintValue());

        rawTypePrintObject.setPrintValue("World");
        System.out.println(rawTypePrintObject.getPrintValue());
    }
}
