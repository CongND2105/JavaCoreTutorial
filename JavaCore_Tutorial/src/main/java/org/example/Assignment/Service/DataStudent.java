package org.example.Assignment.Service;

import org.example.Assignment.Model.StudentHighSchool;
import org.example.Assignment.Model.StudentUnivercity;

import java.util.ArrayList;

public class DataStudent {

    // dữ liệu student
    // list chứa student Univercity
    ArrayList<StudentUnivercity> listUnivercity = new ArrayList<>();
    // list chứa student high school
    ArrayList<StudentHighSchool> listHighSchool = new ArrayList<>();

    // method lấy dữ liệu student Univercity
    public ArrayList<StudentUnivercity> getListStudentUnivercity(){
        listUnivercity.add(new StudentUnivercity("Uni12","Nguyen Van A" ,18,7.6,5.5,7.6,8.8));
        listUnivercity.add(new StudentUnivercity("Uni13","Nguyen Van B" ,18,7.6,7.3,7.6,7.2));
        listUnivercity.add(new StudentUnivercity("Uni14","Nguyen Van C" ,18,7,5.5,7.6,5.2));
        listUnivercity.add(new StudentUnivercity("Uni15","Nguyen Van D" ,18,5.2,5.9,7.6,8.8));
        listUnivercity.add(new StudentUnivercity("Uni16","Nguyen Van E" ,18,4,5.5,7.6,6.2));
        listUnivercity.add(new StudentUnivercity("Uni17","Nguyen Van F" ,18,9.1,7.2,7.6,7.4));
        return listUnivercity;
    }

    //method lấy dữ liệu student highschool
    public ArrayList<StudentHighSchool> getListStudentHighSchool(){
        listHighSchool.add(new StudentHighSchool("HC12","Nguyen Van A" ,16,7.8,5.5,7.2,8.1));
        listHighSchool.add(new StudentHighSchool("HC13","Nguyen Van b" ,16,7.8,5.5,7.2,8.1));
        listHighSchool.add(new StudentHighSchool("HC14","Nguyen Van C" ,16,7.8,5.5,7.2,8.1));
        listHighSchool.add(new StudentHighSchool("HC15","Nguyen Van d" ,16,7.8,5.5,7.2,8.1));
        listHighSchool.add(new StudentHighSchool("HC16","Nguyen Van e" ,16,7.8,5.5,7.2,8.1));
        listHighSchool.add(new StudentHighSchool("HC17","Nguyen Van f" ,16,7.8,5.5,7.2,8.1));
        return listHighSchool;
    }

}
