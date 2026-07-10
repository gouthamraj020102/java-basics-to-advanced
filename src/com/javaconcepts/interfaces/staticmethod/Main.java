package com.javaconcepts.interfaces.staticmethod;

public class Main {
    public static void main(String[] args) {
        Eagle eagleObj = new Eagle();
        eagleObj.digestiveSystemTestMethod();

        System.out.println("---------------------");
        System.out.println(Bird.canBreathe());
        System.out.println("---------------------");
    }
}
