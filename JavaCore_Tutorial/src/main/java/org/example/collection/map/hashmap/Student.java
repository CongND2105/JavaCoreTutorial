package org.example.collection.map.hashmap;

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student(){
    }
    public Student(int id , String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Student{id='" + id + "', name =" + name + "}";
    }
//    @Override
//    public int hashCode(){
//        return Objects.hash(id,name);
//    }
    @Override
    public boolean equals(Object obj){
       if(this == obj) return true;
       System.out.println(this.getClass());
       if(obj == null || getClass() != obj.getClass()) return false ;
       Student student = (Student) obj;
       return id == student.id && name.equals(student.name);
    }

}
