package com.javaconcepts.reflection.fields.settingprivatefield;

import com.javaconcepts.reflection.Eagle;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {

        // Setting the value of Private field
        Class eagleClass = Eagle.class;
        Eagle eagleObj = new Eagle();

        // Get both public and private fields with this
        Field field = eagleClass.getDeclaredField("canSwim");
        field.setAccessible(true); // Important to access and update private fields
        field.set(eagleObj, true);
        if (field.getBoolean(eagleObj)) {
            System.out.println("Value is set to true");
        }
    }
}
