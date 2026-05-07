package com.javaconcepts.core.constructors;

public class Main {
    public static void main(String[] args) {
        Calculation obj1 = Calculation.getInstance();
        System.out.println(obj1.name); // Output: Gowtham
        Calculation obj2 = new Calculation("Gowtham Raju");
        System.out.println(obj2.name); // Output: Gowtham Raju
        Calculation obj3 = new Calculation("Gowtham Raju", 12345);
        System.out.println(obj3.name + ", " + obj3.id); // Output: Gowtham Raju, 12345

        Manager manager = new Manager();
        // Person person = new Person();
    }
}
