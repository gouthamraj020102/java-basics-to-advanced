package com.javaconcepts.classes.genericclass.inheritance.genericsubclass;

public class Main {
    public static void main(String[] args) {
        ColorPrint<String> colorPrintObject = new ColorPrint<>();
        colorPrintObject.setPrintValue("120");
        System.out.println("Print value is " + colorPrintObject.getPrintValue());
    }
}
