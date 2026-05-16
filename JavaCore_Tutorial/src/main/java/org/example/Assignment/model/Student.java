package org.example.Assignment.model;

import org.example.Assignment.utils.ValidationUtil;

import java.util.Scanner;

public abstract class Student {
    protected int id ;
    protected String name;
    protected int age;
    protected double gpa; // tổng điểm trong quá trình học

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa ;

    }
    //tính điểm trung bình
     abstract protected double averageGpa();

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
