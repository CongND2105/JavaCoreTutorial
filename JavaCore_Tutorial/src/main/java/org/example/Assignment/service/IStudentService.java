package org.example.Assignment.service;

import org.example.Assignment.model.Student;

import java.util.ArrayList;

public interface IStudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
    Student findStudentById(int id);
    ArrayList<Student> findAllStudents();

}
