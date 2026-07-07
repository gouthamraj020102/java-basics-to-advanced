package com.javaconcepts.classes.pojoclass;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Goutham Raj");
        student.setRollNumber(118);
        student.setAddress("123 Main St");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Roll Number: " + student.getRollNumber());
        System.out.println("Student Address: " + student.getAddress());
    }
}
