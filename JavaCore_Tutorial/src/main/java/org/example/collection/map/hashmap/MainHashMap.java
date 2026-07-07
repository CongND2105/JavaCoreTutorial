package org.example.collection.map.hashmap;

import java.util.*;

public class MainHashMap {
    public static void main(String [] arr){
        Student st1 = new Student(1,"Cong");
        Student st2 = new Student(1,"Cong");
        Map<Integer, Student> listStudent = new HashMap<>();
        listStudent.put(1,st1);
        listStudent.put(2,st2);
        System.out.println(listStudent);
        System.out.println(st1.equals(st2));
        System.out.println(listStudent.get(1).hashCode());
    }
}
