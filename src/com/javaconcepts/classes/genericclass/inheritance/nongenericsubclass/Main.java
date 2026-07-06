package com.javaconcepts.classes.genericclass.inheritance.nongenericsubclass;

public class Main {
    public static void main(String[] args) {
        ColorPrint colorPrint = new ColorPrint();
        colorPrint.setPrintValue("Hello World");
        System.out.println(colorPrint.getPrintValue());
    }
}
