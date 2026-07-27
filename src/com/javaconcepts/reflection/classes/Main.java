package com.javaconcepts.reflection.classes;

import com.javaconcepts.reflection.Eagle;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        // To get the Particular Class class Object
        // 1. Using forName()
        Class birdClass1 = Class.forName("com.javaconcepts.reflection.classes.Bird");
        System.out.println(birdClass1.getName());

        // 2. Using .class
        Class birdClass2 = Bird.class;
        System.out.println(birdClass2.getName());

        // 3. Using getClass() method
        Bird birdObj = new Bird();
        Class birdClass3 = birdObj.getClass();
        System.out.println(birdClass3.getName());

        System.out.println("--------------------");

        // Reflection of Classes example:
        Class eagleClass = Eagle.class;
        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));
    }
}
