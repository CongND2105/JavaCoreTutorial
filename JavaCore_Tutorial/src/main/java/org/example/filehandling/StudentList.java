package org.example.filehandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

    private List<Student> list;

    public StudentList() {
        this.list = new ArrayList<>(new Data().getData());
        new Data().getData();
    }

    public StudentList(List<Student> list) {
        this.list = list;
    }

    public List<Student> getList() {
        return list;
    }

    //1. add Student
    public void addStudent(Student st) {
        list.add(st);
    }

    //3. check list ís empty
    public boolean checkListEmpty() {
        return list.isEmpty();
    }

    //4. Get quantity in list
    public int getQuantity() {
        return list.size();
    }

    //5 . make list is empty
    public void makeListEmpty() {
        list.clear();
    }

    //6. check student in list is exitst by ID
    public Student studentExists(String id) {
        for (Student st : list) {
            if (st.getId().equals(id)) {
                return st;
            }
        }
        return null;
    }
    //7. delete student from list by ID
    public boolean deleteStudentById(String id){
        Student stTemp = null;
        for(Student st : list){
            if(st.getId().equals(id)){
                stTemp = st;
                break;
            }
        }
        if(stTemp != null){
            list.remove(stTemp);
            return true;
        }else{
            return false;
        }
    }
    //8. Search for all Student by name entered via the keyboard
    public List<Student> listStudentByName(String name){
        ArrayList<Student> listTemp = new ArrayList<>();
        for(Student st : list){
            if(st.getName().contains(name)){
                listTemp.add(st);
            }
        }
        return listTemp;
    }
    //9 Print a list of all students, sorted by score form highest to lowest
    public List<Student> sortStudent(){
        Collections.sort(list);
        return list;
    }

}