package com.javaconcepts.classes.superAndSubClass;

import com.javaconcepts.classes.abstractclass.Audi;
import com.javaconcepts.classes.concreteclass.Person;

public class ObjectTest {
    public static void main(String[] args) {

        ObjectTest obj = new ObjectTest();
        Object obj1 = new Person(1);
        Object obj2 = new Audi(10);

        System.out.println(obj.getClass());
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
    }
}
