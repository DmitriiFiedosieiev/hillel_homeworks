package com.hillel.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHolder {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/videolibrary";

        Properties properties = new Properties();

        properties.put("user", "admin");
        properties.put("password", "admin");
        properties.put("useSSL", "false");
        properties.put("serverTimezone", "UTC");
        properties.put("characterEncoding", "UTF-8");
        properties.put("allowPublicKeyRetrieval", "true");

        return DriverManager.getConnection(url, properties);
    }
}
