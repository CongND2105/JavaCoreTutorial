package org.example.Assignment.Service;

import org.example.Assignment.Model.StudentHighSchool;
import org.example.Assignment.Model.StudentUnivercity;

import java.util.ArrayList;

public class DisplayListStudents {
    // static varriable data
    static DataStudent data = new DataStudent();

    //method hiển thị list student univercity
    public static void displayListUnivercity(){
        ArrayList<StudentUnivercity> displayList = data.getListStudentUnivercity();
        System.out.println(displayList);
    }

    //method hiển thị list student highchool
    public static void displayListHighSchool(){
        ArrayList<StudentHighSchool> displayList = data.getListStudentHighSchool();
        System.out.println(displayList);
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
    public static void displayChoiceFeature(){
        System.out.println("==========================================");
        System.out.println("Chào mừng đến với hệ thống Sinh Viên ");
        System.out.println("Vui Lòng chọn 1 trong các chức năng sau sau :  ");
        System.out.println("1 . Hiển thị Danh Sách Sinh Viên :  ");
        System.out.println("2 . Thêm mới Sinh Viên :  ");
        System.out.println("3 . Cập nhật Sinh Viên ");
        System.out.println("4 . Xóa Sinh Viên ");
        System.out.println("5 . Exit");
        System.out.println("==========================================");
    }

}
