package com.skillnext1.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.skillnext1.db.DBConnection;

public class EmployeeDAO {

    public static void save(Employee emp) {

        String sql = "INSERT INTO employee(name, email, salary) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setDouble(3, emp.getSalary());

            ps.executeUpdate();
            System.out.println("Employee saved successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
