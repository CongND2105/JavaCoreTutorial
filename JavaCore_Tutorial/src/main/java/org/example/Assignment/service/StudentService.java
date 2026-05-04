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
    public void updateStudent(Student student,int id) {
        DataStudent.list.set(id-1,student);

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public Student findStudentById(int id) {
        for(Student s: DataStudent.list){
            if(s.getId()==id){
                System.out.println("Có tồn tại id : " +s.getId());
                System.out.println(s);
                return s;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> findAllStudents() {

        return DataStudent.list;
    }
}
