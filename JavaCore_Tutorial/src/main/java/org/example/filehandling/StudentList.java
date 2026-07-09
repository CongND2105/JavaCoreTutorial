package org.example.filehandling;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    List<Student> list;

    public StudentList(){
    }
    public StudentList(List<Student> list){
        this.list = list;
    }

    public List<Student> getList() {
        return list;
    }
}
