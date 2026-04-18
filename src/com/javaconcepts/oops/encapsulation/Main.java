package com.javaconcepts.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.setColour("Brown");
        System.out.println("Labrador Retriever's Colour: " + labrador.getColour());
    }
}