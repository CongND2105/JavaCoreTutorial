package org.example.filehandling;

import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Student> list = new ArrayList<>();

    public Data(){

    }
    public List<Student> getData(){
        list.add(new Student("H001","Cong",2002,9.8));
        list.add(new Student("H002","Nam",1998,8));
        return list;
    }
}
