package com.javaconcepts.classes.singletonclass.lazy;

// 2. Lazy Initialization: The instance is created only when it is first needed.
// This saves memory, but the basic version is not thread-safe.

public class DBConnection {
    private static DBConnection conObject;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (conObject == null) {
            conObject = new DBConnection();
        }
        return conObject;
    }
}
