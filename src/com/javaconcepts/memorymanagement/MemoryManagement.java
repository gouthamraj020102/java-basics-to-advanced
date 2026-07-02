package com.javaconcepts.memorymanagement;

public class MemoryManagement {
    public static void main(String[] args) {
        int primitiveVariable1 = 10;
        Person personObject = new Person();
        String stringLiteral1 = "24";
        MemoryManagement memoryManagementObject = new MemoryManagement();
        memoryManagementObject.memoryManagementTest(personObject);
    }

    public void memoryManagementTest(Person personObject) {
        Person personObj = personObject;
        String stringLiteral2 = "24";
        String stringObject3 = new String("24");
    }
}
