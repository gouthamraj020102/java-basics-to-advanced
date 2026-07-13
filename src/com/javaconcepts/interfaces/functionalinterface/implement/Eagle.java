package com.javaconcepts.interfaces.functionalinterface.implement;

import com.javaconcepts.interfaces.functionalinterface.Bird;

public class Eagle implements Bird {
    @Override
    public void canFly(String val) {
        System.out.println("Eagle Bird Implementation");
    }
}
