package com.javaconcepts.reflection.constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws Exception {
        Class eagleClass = Eagle.class;

        // to access private Constructor too
        // 1. through Reflection it breaks Singleton/the OOPS principle of Encapsulation
        // 2. Reflection is slow as it works runtime
        Constructor[] eagleConstructorList = eagleClass.getDeclaredConstructors();
        for (Constructor eagleConstructor: eagleConstructorList) {
            System.out.println("Modifier: " + Modifier.toString(eagleConstructor.getModifiers()));
            eagleConstructor.setAccessible(true);
            Eagle eagleObject = (Eagle) eagleConstructor.newInstance();
            eagleObject.fly();
        }
    }
}
