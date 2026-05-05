package org.example.Assignment.view;

import org.example.Assignment.model.Student;
import org.example.Assignment.service.StudentService;

import java.util.List;

public class DisplayListStudents {

    //method hiển thị list Student
    public void displayListStudent(List<? extends Student> list, Class<? extends Student> type){
        System.out.println("Danh Sách Sinh Viên : " +type.getSimpleName());
        System.out.println(list);
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
    public void displayChoiceFeature(int role){
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
