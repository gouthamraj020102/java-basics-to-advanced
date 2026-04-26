package com.javaconcepts.core.variables.primitive;

public class Main {
    public static void main(String[] args) {

        // char example
        char var = 'a';
        System.out.println(var);

        // ASCII value of 'A'
        char ascii1 = 65;
        System.out.println(ascii1);

        // ASCII value of 'a'
        char ascii2 = 97;
        System.out.println(ascii2);


        // byte example
        Employee emp = new Employee();
        emp.getDummyData();


        // long example
        long longVar = 100l;
        System.out.println(longVar);


        // float example
        float var1 = .3f;
        float var2 = .1f;
        float floatVar = var1 - var2;
        System.out.println(floatVar);


        // Widening conversion example
        byte x = 10;
        int intVar = x; // implicit casting from byte to int
        System.out.println(intVar);

        // Narrowing conversion example
        int y = 100;
        byte byteVar = (byte) y; // explicit casting from int to byte
        System.out.println(byteVar);

        // range of byte: -128 to 127
        int integerVar = 128;
        byte byteVariable = (byte) integerVar;
        System.out.println(byteVariable);

        // promotion byte to int
        byte a = 127;
        byte b = 1;
        int sum = a + b;
        System.out.println(sum);

        // explicit casting from double to int
        int c = 34;
        double doubleVar = 20d;
        int doubleSum = (int) (c + doubleVar);
        System.out.println(doubleSum);


        Employee obj1 = new Employee();
        Employee obj2 = new Employee();

        // Class Member or Instance variables
        System.out.println("Class member variables: " + obj1.memberVariable + " + " + obj2.memberVariable);

        // Static variable or Class variable
        System.out.println("Static variable: " + Employee.staticMemberVariable);

        // Local variable
        obj1.getAnotherDummyData();

        // Method with parameters
        System.out.println("Method with parameters: " + obj1.getAnotherDummyData2(2, 5));

        // Constructor parameters
        Employee obj3 = new Employee(10);

        // IEEE 754 standard for floating-point arithmetic
        float floatVar1 = 4.125f;
        double doubleVar1 = floatVar1;
        System.out.println(doubleVar1);

        float floatVar2 = .7f;
        double doubleVar2 = floatVar2;
        System.out.println(doubleVar2);
    }
}
