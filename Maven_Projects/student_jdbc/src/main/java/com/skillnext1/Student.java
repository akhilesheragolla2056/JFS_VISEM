package com.skillnext1;

public class Student {

    private int id;
    private String name;
    private int age;
    private String email;
    private String address;
    private String branch;   // ✅ NEW FIELD

    // 1️⃣ No-argument constructor
    public Student() {}

    // 2️⃣ Constructor with id (used when reading from DB)
    public Student(int id, String name, int age, String email, String address, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.branch = branch;
    }

    // 3️⃣ Constructor without id (used when inserting new student)
    public Student(String name, int age, String email, String address, String branch) {
        this(0, name, age, email, address, branch);
    }

    // ---------------- GETTERS & SETTERS ----------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch() {          // ✅ NEW
        return branch;
    }

    public void setBranch(String branch) { // ✅ NEW
        this.branch = branch;
    }

    // ---------------- toString ----------------
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
