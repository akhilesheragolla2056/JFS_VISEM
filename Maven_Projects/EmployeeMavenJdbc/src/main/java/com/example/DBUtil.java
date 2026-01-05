package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/skill_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
            "root",
            "akhilesh"   // your MySQL password
        );
    }
}
