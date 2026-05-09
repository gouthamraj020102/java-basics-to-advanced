package com.javaconcepts.variables.reference;

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

        // Interface Reference Variable Example
        Person softwareEngineer = new Engineer();
        Person teacher = new Teacher();
        Teacher teacher1 = new Teacher();
        Engineer softwareEngineer1 = new Engineer();

        System.out.println(softwareEngineer.profession()); // returns "Software Engineer"
        System.out.println(teacher.profession()); // returns "Teacher"
        System.out.println(teacher1.profession()); // returns "Teacher"
        System.out.println(softwareEngineer1.profession()); // returns "Software Engineer"

        // Array Reference Variable Example
        int arr[] = new int[5];
        arr[0] = 15;
        System.out.println(arr[0]); // prints 15

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]); // prints 1
        numbers[0] = 10;
        System.out.println(numbers[0]); // prints 10

        // 2D Array Reference Variable Example
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(matrix[1][0]); // prints 4
    }

    public static void modify(Employee empObject) {
        empObject.empId = 20;
    }
}
