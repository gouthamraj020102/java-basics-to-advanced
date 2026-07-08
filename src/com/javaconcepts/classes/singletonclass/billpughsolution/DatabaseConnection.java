package com.javaconcepts.classes.singletonclass.billpughsolution;

// 5. Bill Pugh Solution: The instance is created inside a static inner class
// This version is simple, thread-safe, and avoids extra locking cost

public class DatabaseConnection {
    private DatabaseConnection() {
        // private constructor to prevent instantiation
    }

    private static class DBConnectionHelper {
        private static final DatabaseConnection INSTANCE_OBJECT = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance() {
        return DBConnectionHelper.INSTANCE_OBJECT;
    }
}
