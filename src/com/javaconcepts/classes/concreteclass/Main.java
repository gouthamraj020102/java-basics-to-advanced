package com.javaconcepts.classes.concreteclass;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person(123);
        System.out.println("Employee ID: " + person.getEmpId());

        // Create an instance of the Rectangle class and call the child class computeArea method
        Shape rectangle = new Rectangle();
        rectangle.computeArea();
    }
}
