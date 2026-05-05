package org.example.Assignment.service;

import org.example.Assignment.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    void updateStudent(Student student,int id);
    void deleteStudent(Student student);
    Student findStudentById(int id);
    List<Student> findAllStudents();

}
