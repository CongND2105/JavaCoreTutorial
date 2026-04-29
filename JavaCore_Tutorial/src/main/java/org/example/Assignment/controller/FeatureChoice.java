package org.example.Assignment.controller;

import org.example.Assignment.model.Student;
import org.example.Assignment.Utils;
import org.example.Assignment.model.StudentHighSchool;
import org.example.Assignment.model.StudentUnivercity;
import org.example.Assignment.repository.DataStudent;
import org.example.Assignment.service.StudentUnivercityService;

import java.util.ArrayList;
import java.util.Scanner;

public class FeatureChoice {
    Scanner sc = new Scanner(System.in);
    StudentUnivercityService sts= new StudentUnivercityService();
    ArrayList<Student> list = DataStudent.list;
    public void choiceMain(){
        boolean flag = true ;
        while(flag){
            DisplayListStudents.displayChoiceSchool();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    choiceFeatureStudents(choice);
                    flag = false;
                    break;
                case 2 :
                    choiceFeatureStudents(choice);
                    flag = false;
                    break;
                case 3 :
                    System.exit(0);
                default:
                    System.out.println("Vui Lòng chọn đúng số");
            }

        }


    }

    //method chọn chức năng của sinh viên
    public void choiceFeatureStudents(int role){
        Class<?> type;
        if(role ==1){
            type = StudentUnivercity.class;
        }else{
            type = StudentHighSchool.class;
        }
        boolean flag = true;
        while (flag){
            DisplayListStudents.displayChoiceFeature(role);
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println(DisplayListStudents.getListStudentByType(list,type));
                    break;
                case 2 :
                    System.out.println("Chức năng thêm mới sinh viên " );
                    if(role ==1){
                        Student s = inputUnivercityStudent();
                        sts.addStudent(s);
                    }else {
                        Student s = inputHighSchoolStudent();
                        sts.addStudent(s);
                    }

                    break;
                case 3 :
                    System.out.println("Chức năng cập nhật sinh viên");
                    flag = false;
                    break;
                case 4 :
                    System.out.println("Chức năng xóa sinh viên ");
                    flag = false;
                    break;
                case 5 :
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn đúng chức năng");
            }

        }
    }
    public Student inputUnivercityStudent(){
        System.out.println(" Nhập vào mã sinh vien :  ");
        String masv = sc.nextLine();
        System.out.println(" Nhập vào ten sinh vien :  ");
        String hoten = sc.nextLine();
        System.out.println(" Nhập vào tuoi sinh vien :  ");
        int tuoi = sc.nextInt();
        System.out.println(" Nhập vào gpa sinh vien :  ");
        double gpa = sc.nextDouble();
        System.out.println(" Nhập vào diem toan :  ");
        double diemToan = sc.nextDouble();
        System.out.println(" Nhập vào diem ly:  ");
        double diemLy = sc.nextDouble();
        System.out.println(" Nhập vào diem hoa :  ");
        double diemHoa = sc.nextDouble();
        sc.nextLine();
        return new StudentUnivercity(masv,hoten,tuoi,gpa,diemToan,diemLy,diemHoa);
    }

}
