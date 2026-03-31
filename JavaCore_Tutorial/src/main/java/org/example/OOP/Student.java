package org.example.OOP;

public class Student {

    String name;
    int age;

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
