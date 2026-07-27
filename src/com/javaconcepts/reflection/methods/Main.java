package com.javaconcepts.reflection.methods;

import com.javaconcepts.reflection.Eagle;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        // Reflection of Methods example:
        Class eagleClass = Eagle.class;

        // All public methods it will return
        Method[] methods1 = eagleClass.getMethods();
        printFieldDetails(methods1);

        // All public and private methods it will return within Eagle class only
        Method[] methods2 = eagleClass.getDeclaredMethods();
        printFieldDetails(methods2);
    }

    public static void printFieldDetails(Method[] methods) {
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Class Name: " + method.getDeclaringClass());
            System.out.println("*******");
        }
    }
}
