package com.javaconcepts.classes.immutableclass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> petNames = new ArrayList<>();
        petNames.add("sj");
        petNames.add("pj");
        MyImmutableClass obj = new MyImmutableClass("myName", petNames);
        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList());
    }
}
