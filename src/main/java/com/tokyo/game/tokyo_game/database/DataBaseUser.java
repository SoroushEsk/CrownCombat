package com.tokyo.game.tokyo_game.database;

import com.tokyo.game.tokyo_game.security.password.Password;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUser {

    /**
     * Attempts to log in a user with the provided username and password.
     *
     * @param username the username of the user
     * @param password the password of the user
     * @return true if the login is successful, false otherwise
     */
    public boolean userLogin(String username, String password) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Get a connection
            conn = Database.getInstance().getConnection();

            // Prepare a statement to prevent SQL injection
            String query = "SELECT password FROM users WHERE username = ?;";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);

            // Execute the query
            rs = pstmt.executeQuery();

            // Check if user exists and password matches
            if (rs.next()) {
                String storedPassword = rs.getString("password");
                return new Password(storedPassword, true).isPasswordCorrect(password, storedPassword);
            }
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            return false;
        } finally {
            // Close resources to prevent memory leaks
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.err.println("SQL Error on close: " + ex.getMessage());
            }
        }
        return false;
    }

    public void createTable() throws SQLException {

        Database.getInstance().executeUpdate("""
                CREATE TABLE IF NOT EXISTS users (
                id SERIAL PRIMARY KEY,
                username VARCHAR(255) UNIQUE NOT NULL,
                password VARCHAR(255) NOT NULL,
                email VARCHAR(255) UNIQUE NOT NULL,
                level INT ,
                xp    INT,
                hp    INT,
                coin_count INT,
                created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP);
                """
        );

    }
}
