package com.javaconcepts.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Method overloading or Static polymorphism or Compile time polymorphism
        Sum calcobj = new Sum();
        System.out.println(calcobj.doSum(5, 2));
        System.out.println(calcobj.doSum(3, 4, 2));
    }
}