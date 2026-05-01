package org.example.Assignment.controller;

import org.example.Assignment.model.Student;
import org.example.Assignment.model.StudentHighSchool;
import org.example.Assignment.model.StudentUnivercity;
import org.example.Assignment.Utils;
import org.example.Assignment.repository.DataStudent;

import java.util.ArrayList;

public class DisplayListStudents {

    // khai báo 1 List chứa toàn bộ sinh vien
    static ArrayList<Student> list = DataStudent.list;

    //method hiển thị list Student
    public static void displayListStudent(Class<? extends Student> type){
        ArrayList<? extends Student> displayList = getListStudentByType(list,type);
        System.out.println("Danh Sách Sinh Viên : " +type.getSimpleName());
        System.out.println(displayList);


    }

    //method generic giúp tối ưu , không lặp code, lấy đúng ra danh sách mình cần tìm
    public static<T extends Student> ArrayList<T> getListStudentByType(ArrayList<Student> list, Class<T> type){
        ArrayList<T> result = new ArrayList<>();
        for(Student st : list){
            if(type.isInstance(st)){
                result.add(type.cast(st));
            }
        }
       return result;
    }
    
    //method hiển thị lựa chọn trường
    public static void displayChoiceSchool(){
        System.out.println("==========================================");
        System.out.println("Chào mừng đến với hệ thống Sinh Viên ");
        System.out.println("Vui Lòng chọn 1 trong 2 sinh viên sau :  ");
        System.out.println("1 . Sinh Viên Đại Học");
        System.out.println("2 . Sinh Viên Phổ Thông ");
        System.out.println("3 . Exit");
        System.out.println("==========================================");
    }

    //method hiển thị chức năng trường
    public static void displayChoiceFeature(int role){
        String roleName;
        if(role ==1){
            roleName = "Đại Học";
        }else {
            roleName = "Phổ Thông ";
        }
        System.out.println("==========================================");
        System.out.println("Chào mừng đến với hệ thống Sinh Viên " + roleName);
        System.out.println("Vui Lòng chọn 1 trong các chức năng sau sau :  ");
        System.out.println("1 . Hiển thị Danh Sách Sinh Viên  ");
        System.out.println("2 . Thêm mới Sinh Viên  ");
        System.out.println("3 . Cập nhật Sinh Viên ");
        System.out.println("4 . Xóa Sinh Viên ");
        System.out.println("5 . Exit");
        System.out.println("==========================================");
    }

}
