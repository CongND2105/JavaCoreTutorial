package org.example.Assignment.service;

import org.example.Assignment.controller.DisplayListStudents;
import org.example.Assignment.model.Student;
import org.example.Assignment.model.StudentUnivercity;
import org.example.Assignment.repository.DataStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentUnivercityService {
    public void addStudent(Student st){
       DataStudent.list.add(st);

    }


}
