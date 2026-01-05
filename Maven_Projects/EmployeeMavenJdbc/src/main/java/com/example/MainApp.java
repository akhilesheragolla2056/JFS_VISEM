package com.example;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String username = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        if (!LoginDAO.validate(username, password)) {
            System.out.println("Invalid credentials. Access denied.");
            return;
        }

        System.out.println("Login successful");

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Insert Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. View Employee By ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Employee Name: ");
                    String name = sc.next();

                    System.out.print("Department: ");
                    String dept = sc.next();

                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();

                    EmployeeDAO.insertEmployee(name, dept, salary);
                    break;

                case 2:
                    EmployeeDAO.getAllEmployees();
                    break;

                case 3:
                    System.out.print("Employee ID: ");
                    EmployeeDAO.getEmployeeById(sc.nextInt());
                    break;

                case 4:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String n = sc.next();
                    System.out.print("Dept: ");
                    String d = sc.next();
                    System.out.print("Salary: ");
                    double s = sc.nextDouble();

                    EmployeeDAO.updateEmployee(id, n, d, s);
                    break;

                case 5:
                    System.out.print("ID to delete: ");
                    EmployeeDAO.deleteEmployee(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
