package com.javaconcepts.reflection.fields;

import com.javaconcepts.reflection.Eagle;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        // Reflection of fields

        Class eagleClass = Eagle.class;

        // Get public fields with this
        Field[] fields1 = eagleClass.getFields();
        printFieldDetails(fields1);

        // Get both public and private fields with this
        Field[] fields2 = eagleClass.getDeclaredFields();
        printFieldDetails(fields2);
    }

    public static void printFieldDetails(Field[] fields) {
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
            System.out.println("**********");
        }
    }
}
