package org.example.Lab8;

public class MainLab8 {
    public static void main(String[] args) {
        Person ps1 = new Person("1","Nguyen Van A", 22);
        System.out.println(ps1.getName());
        Student ps2 = new Student("2","Nguyen Van B ",24,4);
        ps2.setGrade();
        System.out.println(ps2.getGrade());
    }
}
