package com.javaconcepts.classes.singletonclass.synchronization;

// 3. Synchronized Method: The instance is created on first use and the method is synchronized.
// This makes it thread-safe, but it can be slower because of locking.

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection() {
    }

    synchronized public static DBConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
