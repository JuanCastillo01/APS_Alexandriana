package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQL_Alexandria {
	static final private String url = "jdbc:postgresql://localhost/Alexandria";
	static final private String username = "postgres";
	static final private String password = "00000000";
	
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);

            if (conn != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.out.println("Failed to make connection!");
        }

        return conn;
    }
}
