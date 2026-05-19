package org.example.Assignment.service;

import org.example.Assignment.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    private final List<Student> list;

    public StudentService(List<Student> list){

        this.list = list;
    }
    @Override
    public void addStudent(Student st){
            list.add(st);
    }

    @Override
    public List<Student> findAllStudents(){
        return list;
    }
    @Override
    public void updateStudent(Student student,int id) {
        int index = -1 ;
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).getId() == id){
                index = i;
                break;
            }
        }
        if(index != -1){
            list.set(index,student);
            System.out.println("Successfully updated student with id "+student.getId());
        }else {
            System.out.println("Student not found");
        }


    }

    @Override
    public void deleteStudent(Student student) {
        list.remove(student);
    }

    @Override
    public Student findStudentById(int id) {
        for(Student s: list){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }

    //method generic giúp tối ưu , không lặp code, lấy đúng ra danh sách mình cần tìm
    public <T extends Student> List<T> getListStudentByType(List<Student> list, Class<T> type){
        //Khởi tạo 1 ArrayList mới để chứa List Student cụ thể
        List<T> result = new ArrayList<>();
        for(Student st : list){
            // nếu Student là 1 type (Class) thì sẽ add vào List mới
            if(type.isInstance(st)){
                // add vào list mới và cast kiểu st về type
                result.add(type.cast(st));
            }
        }
        return result;
    }

}
