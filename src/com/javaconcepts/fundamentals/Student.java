package com.javaconcepts.fundamentals;

public class Student {
    // 1. Data Variables
    // These belong to the object, not a specific method.
    private int age;
    private String address;

    // 2. Constructor (Optional but good practice)
    public Student(int age, String address) {
        this.age = age;
        this.address = address;
    }

    // 3. Data Methods (Behaviors)
    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}