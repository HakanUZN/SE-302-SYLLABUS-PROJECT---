package com.example.se302syllabusproject;

import com.example.se302syllabusproject.DataModel.*;

import java.security.PrivilegedAction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

    private final String databaseURL = "jdbc:sqlite:Syllabus_DB.db";
    private Connection conn;

    public DatabaseHandler() {
        conn = null;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(databaseURL);

            if (conn != null ) {
                System.out.println("Database Inıtialized.");
            } else {
                System.out.println("Failed to Initialize Database");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
