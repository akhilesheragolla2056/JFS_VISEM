package com.skillnext.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

        // Create employee object
        Employee emp = new Employee();
        emp.setName("Akhilesh");
        emp.setEmail("akhilesh@gmail.com");
        emp.setSalary(50000);

        // Open Hibernate session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // Save object
        session.save(emp);

        tx.commit();
        session.close();

        System.out.println("Employee saved using Hibernate");
    }
}
