package org.example.Assignment.repository;

import org.example.Assignment.model.Student;
import org.example.Assignment.model.StudentHighSchool;
import org.example.Assignment.model.StudentUnivercity;

import java.util.ArrayList;
import java.util.List;

public class DataStudent {

    // dữ liệu student

    //tạo ra 1 list chứa tất cả sinh viên
    private final List<Student> list = new ArrayList<>();

    //method lấy tất cả sinh viên
    public DataStudent(){
        list.add(new StudentUnivercity(1,"Nguyen Van A" ,18,7.6,5.5,7.6,8.8));
        list.add(new StudentUnivercity(2,"Nguyen Van B" ,18,7.6,7.3,7.6,7.2));
        list.add(new StudentUnivercity(3,"Nguyen Van C" ,18,7,5.5,7.6,5.2));
        list.add(new StudentUnivercity(4,"Nguyen Van D" ,18,5.2,5.9,7.6,8.8));
        list.add(new StudentUnivercity(5,"Nguyen Van E" ,18,4,5.5,7.6,6.2));
        list.add(new StudentUnivercity(6,"Nguyen Van F" ,18,9.1,7.2,7.6,7.4));
        //high-school data
        list.add(new StudentHighSchool(7,"Nguyen Van A" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool(8,"Nguyen Van b" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool(9,"Nguyen Van C" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool(10,"Nguyen Van d" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool(11,"Nguyen Van e" ,16,7.8,5.5,7.2,8.1));
        list.add(new StudentHighSchool(12,"Nguyen Van f" ,16,7.8,5.5,7.2,8.1));
    }

    public List<Student> getList(){
        return list;
    }




}
