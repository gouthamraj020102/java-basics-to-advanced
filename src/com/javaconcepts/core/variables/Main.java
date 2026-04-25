package com.javaconcepts.core.variables;

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
    }
}
