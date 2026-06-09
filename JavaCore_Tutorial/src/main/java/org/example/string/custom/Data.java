package org.example.string.custom;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<SinhVien> list = new ArrayList<>();
    public Data(){
        list.add(new SinhVien(1,"Nguyen Van B","CS50",6.5));
        list.add(new SinhVien(2,"Nguyen Van A","CS50",9.5));
        list.add(new SinhVien(3,"Nguyen Van C","CS50",2.5));
    }

    public List<SinhVien> getList(){
        return list;
    }

}
