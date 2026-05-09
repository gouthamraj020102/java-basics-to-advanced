package com.javaconcepts.variables.wrapper;

public class WrapperClass {
    public static void main(String[] args) {

        // Wrapper class example
        // int -> Integer
        // char -> Character
        // byte -> Byte
        // short -> Short
        // long -> Long
        // float -> Float
        // double -> Double
        // boolean -> Boolean

        // Autoboxing example
        int a = 10;
        Integer a1 = a; // Autoboxing: primitive to wrapper
        System.out.println("Wrapper Integer: " + a1);

        // Unboxing example
        Integer b = 20;
        int b1 = b; // Unboxing: wrapper to primitive
        System.out.println("Primitive int: " + b1);


        // Constant Variable example
        Employee emp1 = new Employee();
        // emp1.EMP_ID = 20; // This will cause a compile-time error because EMP_ID is final
        Employee emp2 = new Employee();
        System.out.println("Employee ID: " + Employee.EMP_ID);
    }
}
