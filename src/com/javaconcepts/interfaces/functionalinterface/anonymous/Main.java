package com.javaconcepts.interfaces.functionalinterface.anonymous;

import com.javaconcepts.interfaces.functionalinterface.Bird;

public class Main {
    public static void main(String[] args) {
        Bird eagleObject = new Bird() {
            @Override
            public void canFly(String val) {
                System.out.println("Eagle Bird Implementation");
            }
        };
        eagleObject.canFly("vertical");
    }
}
