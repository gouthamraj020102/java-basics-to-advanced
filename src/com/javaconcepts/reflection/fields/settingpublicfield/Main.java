package com.javaconcepts.reflection.fields.settingpublicfield;

import com.javaconcepts.reflection.Eagle;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {

        // Setting the value of Public field
        Class eagleClass = Eagle.class;
        Eagle eagleObj = new Eagle();

        // Get both public and private fields with this
        Field field = eagleClass.getDeclaredField("breed");
        field.set(eagleObj, "eagleBrownBreed");
        System.out.println(eagleObj.breed);
    }
}
