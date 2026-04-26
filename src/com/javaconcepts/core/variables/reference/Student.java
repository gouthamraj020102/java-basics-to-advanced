package com.javaconcepts.core.variables.reference;

public class Student {
    public static void main(String[] args) {
        // Class Reference Variable Example
        Employee empObject = new Employee();
        empObject.empId = 10;
        modify(empObject);
        System.out.println(empObject.empId);

        // String Reference Variable Example
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2); // true, because string literals are interned
        System.out.println(s1.equals(s2)); // true, because content is the same

        String s3 = new String("hello");
        System.out.println(s1 == s3); // false, because s3 is a new object
        System.out.println(s1.equals(s3)); // true, because content is the same
        System.out.println(s3); // prints "hello"

        s3 = "SJ";
        System.out.println(s3); // prints the new "SJ" String literal, not the old "hello" String object
    }

    public static void modify(Employee empObject) {
        empObject.empId = 20;
    }
}
