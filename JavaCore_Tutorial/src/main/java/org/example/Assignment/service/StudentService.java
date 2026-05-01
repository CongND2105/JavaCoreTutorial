package org.example.Assignment.service;

import org.example.Assignment.model.Student;
import org.example.Assignment.repository.DataStudent;

import java.util.ArrayList;

public class StudentService implements IStudentService {
    public void addStudent(Student st){
       DataStudent.list.add(st);
       System.out.println("đã thêm thành công sinh viên ");
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public Student findStudentById(int id) {
        return null;
    }

    @Override
    public ArrayList<Student> findAllStudents() {
        return null;
    }
}
