package com.javaconcepts.interfaces.privatemethod;

public interface Bird {
    void canFly();

    // Default Method
    public default void minimumFlyingHeight() {
        myStaticPublicMethod();
        myPrivateMethod();
        myPrivateStaticMethod();
    }

    // Static Method
    static void myStaticPublicMethod() {
        myPrivateStaticMethod();
    }

    // Private Method
    private void myPrivateMethod() {
        System.out.println("Inside Private Method");
    }

    // Private Static Method
    private static void myPrivateStaticMethod() {
        System.out.println("Inside Private Static Method");
    }
}
