package com.javaconcepts.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Method overloading or Static polymorphism or Compile time polymorphism
        Sum calcobj = new Sum();
        System.out.println(calcobj.doSum(5, 2));
        System.out.println(calcobj.doSum("A", "B"));
        System.out.println(calcobj.doSum(3, 4, 2));

        // Method overriding or Dynamic polymorphism or Runtime polymorphism
        B objB = new B();
        System.out.println(objB.getEngine());
        A objA = new A();
        System.out.println(objA.getEngine());
    }
}