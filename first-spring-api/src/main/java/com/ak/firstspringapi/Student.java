package com.ak.firstspringapi;

public class Student {
    private String name;
    private int regNo;
    private String email;
    private String course;
    private int age;
    private String address;

    Student(){

    }

    public Student(String name, int regNo, String email, String course, int age, String address) {
        this.name = name;
        this.regNo = regNo;
        this.email = email;
        this.course = course;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
