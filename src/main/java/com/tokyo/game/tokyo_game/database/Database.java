package com.tokyo.game.tokyo_game.database;

import java.sql.*;

public class Database {
    protected static Database instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/tokyo_game";
    private String username = "root";
    private String password = "sesk1381";

    private Database() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public ResultSet executeQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);

    }
    public int executeUpdate(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(query);
    }

    public boolean tableExist(String tableName) throws SQLException {
        ResultSet resultSet = instance.executeQuery(String.format("""
                SELECT COUNT(*)
                FROM information_schema.tables
                WHERE table_schema = 'tokyo_game'
                AND table_name = '%s';
                                
                """, tableName));
        resultSet.next();
        int exist = resultSet.getInt("COUNT(*)");
        return exist == 1 ? true : false;
    }
    public static Database getInstance() throws SQLException {
        if (instance == null) {
            instance = new Database();
        } else if (instance.getConnection().isClosed()) {
            instance = new Database();
        }

        return instance;
    }
}

