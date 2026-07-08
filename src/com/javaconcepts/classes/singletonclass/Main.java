package com.javaconcepts.classes.singletonclass;

import com.javaconcepts.classes.singletonclass.doublechecklocking.DatabaseConnection;
import com.javaconcepts.classes.singletonclass.eager.DBConnection;

public class Main {
    public static void main(String[] args) {

        // 1. Eager initialization creates the instance at class load.
        System.out.println("Eager Initialization:");
        DBConnection eagerInitialization1 = DBConnection.getInstance();
        DBConnection eagerInitialization2 = DBConnection.getInstance();
        System.out.println(eagerInitialization1);
        System.out.println(eagerInitialization2);

        // 2. Lazy initialization creates the instance only on first use.
        System.out.println("Lazy Initialization:");
        com.javaconcepts.classes.singletonclass.lazy.DBConnection lazyInitialization1 = com.javaconcepts.classes.singletonclass.lazy.DBConnection.getInstance();
        com.javaconcepts.classes.singletonclass.lazy.DBConnection lazyInitialization2 = com.javaconcepts.classes.singletonclass.lazy.DBConnection.getInstance();
        System.out.println(lazyInitialization1);
        System.out.println(lazyInitialization2);

        // 3. Synchronized method keeps the singleton safe for multiple threads.
        System.out.println("Synchronized Method:");
        com.javaconcepts.classes.singletonclass.synchronization.DBConnection synchronization1 = com.javaconcepts.classes.singletonclass.synchronization.DBConnection.getInstance();
        com.javaconcepts.classes.singletonclass.synchronization.DBConnection synchronization2 = com.javaconcepts.classes.singletonclass.synchronization.DBConnection.getInstance();
        System.out.println(synchronization1);
        System.out.println(synchronization2);

        // 4. Double-checked locking reduces locking cost while staying safe.
        System.out.println("Double-Checked Locking:");
        DatabaseConnection doubleCheckedLocking1 = DatabaseConnection.getInstance();
        DatabaseConnection doubleCheckedLocking2 = DatabaseConnection.getInstance();
        System.out.println(doubleCheckedLocking1);
        System.out.println(doubleCheckedLocking2);

        // 5. Bill Pugh solution uses an inner class for safe lazy initialization.
        System.out.println("Bill Pugh Solution:");
        com.javaconcepts.classes.singletonclass.billpughsolution.DatabaseConnection billPughSolution1 = com.javaconcepts.classes.singletonclass.billpughsolution.DatabaseConnection.getInstance();
        com.javaconcepts.classes.singletonclass.billpughsolution.DatabaseConnection billPughSolution2 = com.javaconcepts.classes.singletonclass.billpughsolution.DatabaseConnection.getInstance();
        System.out.println(billPughSolution1);
        System.out.println(billPughSolution2);

        // 6. Enum singleton is a simple and reliable way to create one instance.
        System.out.println("Enum Singleton:");
        com.javaconcepts.classes.singletonclass.enumsingleton.DBConnection enumSingleton1 = com.javaconcepts.classes.singletonclass.enumsingleton.DBConnection.INSTANCE;
        com.javaconcepts.classes.singletonclass.enumsingleton.DBConnection enumSingleton2 = com.javaconcepts.classes.singletonclass.enumsingleton.DBConnection.INSTANCE;
        System.out.println(enumSingleton1);
        System.out.println(enumSingleton2);
    }
}
