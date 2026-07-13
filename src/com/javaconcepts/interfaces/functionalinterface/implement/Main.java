package com.javaconcepts.interfaces.functionalinterface.implement;

import com.javaconcepts.interfaces.functionalinterface.Bird;

public class Main {
    public static void main(String[] args) {
        Bird eagleObject = new Eagle();
        eagleObject.canFly("vertical");
    }
}
