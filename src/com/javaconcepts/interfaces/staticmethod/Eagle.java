package com.javaconcepts.interfaces.staticmethod;

public class Eagle implements Bird {
    public void digestiveSystemTestMethod() {
        if(Bird.canBreathe()) {
            System.out.println("Accessed static method");
        }
    }
}
