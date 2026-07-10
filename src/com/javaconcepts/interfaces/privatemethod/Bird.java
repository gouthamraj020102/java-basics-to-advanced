package com.javaconcepts.interfaces.privatemethod;

public interface Bird {
    void canFly();

    public default void minimumFlyingHeight() {
        myStaticPublicMethod();
        myPrivateMethod();
        myPrivateStaticMethod();
    }

    static void myStaticPublicMethod() {
        myPrivateStaticMethod();
    }

    private void myPrivateMethod() {
        System.out.println("Inside Private Method");
    }

    private static void myPrivateStaticMethod() {
        System.out.println("Inside Private Static Method");
    }
}
