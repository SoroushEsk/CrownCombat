package com.tokyo.game.tokyo_game.database;

import java.sql.SQLException;

public class DataBaseUser {



    public void createTable() throws SQLException {

        Database.getInstance().executeUpdate("""
                CREATE TABLE IF NOT EXISTS users (
                id SERIAL PRIMARY KEY,
                username VARCHAR(255) NOT NULL,
                password VARCHAR(255) NOT NULL,
                email VARCHAR(255) UNIQUE NOT NULL,
                created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP);
                """
        );

    }
}
