package com.javaconcepts.methods;

public class Nurse extends Surgeon {

    @Override
    public void performSurgery() {
        System.out.println("Performing surgery with a Surgeon");
    }
    
}
