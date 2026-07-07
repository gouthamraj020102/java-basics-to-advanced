package com.javaconcepts.classes.finalclass;

/*
The commented code will give compile time error because TestClass is declared as final class
final class cannot be extended or inherited by any other class
Hence, MyOtherClass cannot extend TestClass
 */

// public class MyOtherClass extends TestClass {
public class MyOtherClass {
    public void display() {
        System.out.println("This is MyOtherClass");
    }
    
}
