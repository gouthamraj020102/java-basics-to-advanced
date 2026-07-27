package com.javaconcepts.reflection.methodinvoke;

import java.lang.reflect.Method;

public class Main {
    public static void main(String args[]) throws Exception {

        // Invoking Method using Reflection:
        Class eagleClass = Class.forName("com.javaconcepts.reflection.methodinvoke.Eagle");
        Object eagleObject = eagleClass.newInstance();
        Method flyMethod = eagleClass.getMethod("fly", int.class, boolean.class, String.class);
        flyMethod.invoke(eagleObject, 1, true, "hello");
    }
}
