package com.javaconcepts.classes.singletonclass.doublechecklocking;

// 4. Double-Checked Locking: It checks the instance twice to reduce locking overhead.
// The volatile keyword helps all threads see the correct instance value.
public class DatabaseConnection {
    private static volatile DatabaseConnection conObject;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (conObject == null) {
            synchronized (DatabaseConnection.class) {
                if (conObject == null) {
                    conObject = new DatabaseConnection();
                }
            }
        }
        return conObject;
    }
}
