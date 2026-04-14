package org.example.Lab6;

import java.util.ArrayList;

public class StudentSearcher {

    public ArrayList<Student> listStudents(){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Nguyễn Văn A ",1));
        students.add(new Student("Phùng Văn B ",2));
        students.add(new Student("Nguyễn Văn C ",3));
        students.add(new Student("Thị Văn D ",4));
        students.add(new Student("Lê Văn E ",5));
        return students;
    }
    public void getListStudents(ArrayList<Student> students){
        System.out.println("Danh sach sinh vien ");
        for(int i = 0 ; i <students.size() ; i++){
            System.out.println(students.get(i));
        }
    }

    public void searchStudentByName(ArrayList<Student> students ,String name){
        System.out.println("Ket qua tim kiem ");
        for(int i = 0 ; i <students.size() ; i++){
            if(students.get(i).name.startsWith(name)){
                System.out.println("Ten : " +students.get(i).name);
            }
        }
    }
}
