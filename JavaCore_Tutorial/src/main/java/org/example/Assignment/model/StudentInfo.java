package org.example.Assignment.model;

import org.example.Assignment.utils.ValidationUtil;

public class StudentInfo {

    //Create Class StudentInfo reference đến Student nhập xuất Student (tránh duplicate code)


    private int id ;
    private String name;
    private int age ;
    private double gpa;

    public StudentInfo() {
    }

    public StudentInfo(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

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

    public void setAge(int age) throws IllegalArgumentException {
        ValidationUtil.checkAge(age);
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        ValidationUtil.checkGpa(gpa);
        this.gpa = gpa;
    }
}
