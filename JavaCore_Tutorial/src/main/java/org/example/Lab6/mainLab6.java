package org.example.Lab6;


import java.util.ArrayList;

public class mainLab6 {
    public static void main(String[] args) {
        AuthService b1 = new AuthService();
        b1.activeAccount();
        StudentSearcher s1 = new StudentSearcher();
        ArrayList<Student> list = s1.listStudents();
        s1.getListStudents(list);
        s1.searchStudentByName(list,"Nguyễn");
    }
}
