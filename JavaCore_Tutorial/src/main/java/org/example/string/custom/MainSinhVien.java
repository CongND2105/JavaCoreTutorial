package org.example.string.custom;


import java.util.Collections;
import java.util.List;

public class MainSinhVien {
    public static void main(String[] args) {
        Data data = new Data();
        List<SinhVien> list = data.getList();
        Collections.sort(list);
        for(SinhVien sv : list){
            System.out.println(sv.toString());
        }
    }
}
