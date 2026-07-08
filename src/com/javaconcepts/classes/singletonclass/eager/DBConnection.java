package com.javaconcepts.classes.singletonclass.eager;

// 1. Eager Initialization: The instance is created when the class loads.
// It is simple and thread-safe, but it may use memory even if the object is never used.

public class DBConnection {
    private static final DBConnection conObject = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return conObject;
    }
}
