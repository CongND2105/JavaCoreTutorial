package org.example.OOP;

public class Student {
    private String name;
    private int age;

    public void Student(){

    }
    public void Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void learnIT() {
        System.out.println("Đang học IT");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }



}
