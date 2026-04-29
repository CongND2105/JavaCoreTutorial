package org.example.Assignment.repository;

import org.example.Assignment.model.Student;
import org.example.Assignment.model.StudentHighSchool;
import org.example.Assignment.model.StudentUnivercity;

import java.util.ArrayList;

public class DataStudent {

    // dữ liệu student

    //tạo ra 1 list chứa tất cả sinh viên
    public static ArrayList<Student> list = new ArrayList<>();

    //method lấy tất cả sinh viên
   static{
        //univercity data
        list.add(new StudentUnivercity("Uni12","Nguyen Van A" ,18,7.6,5.5,7.6,8.8));
        list.add(new StudentUnivercity("Uni13","Nguyen Van B" ,18,7.6,7.3,7.6,7.2));
        list.add(new StudentUnivercity("Uni14","Nguyen Van C" ,18,7,5.5,7.6,5.2));
        list.add(new StudentUnivercity("Uni15","Nguyen Van D" ,18,5.2,5.9,7.6,8.8));
        list.add(new StudentUnivercity("Uni16","Nguyen Van E" ,18,4,5.5,7.6,6.2));
        list.add(new StudentUnivercity("Uni17","Nguyen Van F" ,18,9.1,7.2,7.6,7.4));
        //high-school data
        list.add(new StudentHighSchool("HC12","Nguyen Van A" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool("HC13","Nguyen Van b" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool("HC14","Nguyen Van C" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool("HC15","Nguyen Van d" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool("HC16","Nguyen Van e" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool("HC17","Nguyen Van f" ,16,7.8,5.5,7.2,8.1));
    }




}
