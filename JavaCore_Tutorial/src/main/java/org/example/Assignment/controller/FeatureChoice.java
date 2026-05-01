package org.example.Assignment.controller;

import org.example.Assignment.model.Student;
import org.example.Assignment.model.StudentHighSchool;
import org.example.Assignment.model.StudentInfo;
import org.example.Assignment.model.StudentUnivercity;
import org.example.Assignment.repository.DataStudent;
import org.example.Assignment.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class FeatureChoice {

    Scanner sc = new Scanner(System.in);
    StudentService sts= new StudentService();

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

    //method tạo sinh viên bởi role
    public Student createStudentByRole(int role){
        switch (role){
            case 1:
                return inputUnivercityStudent();
            case 2 :
                return inputHighSchoolStudent();
            default:
                System.out.println("Role không hợp lệ");
                return null;
        }
    }

    //method createClassbyRole
    public Class<?extends Student> createClassByRole(int role) {
        Class<? extends Student> clazz;
        switch (role) {
            case 1:
                return clazz = StudentUnivercity.class;
            case 2:
                return clazz = StudentHighSchool.class;
            default:
                System.out.println("Không có class hợp lệ");
                return null;
        }
    }

    //method chọn chức năng của sinh viên
    public void choiceFeatureStudents(int role){
        // khai báo Class - type
        Class<? extends Student> type;
        type = createClassByRole(role);
        boolean flag = true;
        while (flag){
            DisplayListStudents.displayChoiceFeature(role);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    DisplayListStudents.displayListStudent(type);
                    break;
                case 2 :
                    System.out.println("Chức năng thêm mới sinh viên " );
                    Student s = createStudentByRole(role);
                    sts.addStudent(s);
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

    //method input Student
    public StudentInfo inputStudent(){
        System.out.println(" Nhập vào mã sinh vien :  ");
        int masv = sc.nextInt();
        //clear Scanner (enter)
        sc.nextLine();
        System.out.println(" Nhập vào ten sinh vien :  ");
        String hoten = sc.nextLine();
        System.out.println(" Nhập vào tuoi sinh vien :  ");
        int tuoi = sc.nextInt();
        System.out.println(" Nhập vào gpa sinh vien :  ");
        double gpa = sc.nextDouble();
        return new StudentInfo(masv,hoten,tuoi,gpa);

    }

    //method input UnivercityStudent
    public Student inputUnivercityStudent(){
        StudentInfo info = inputStudent();
        System.out.println(" Nhập vào diem toan :  ");
        double diemToan = sc.nextDouble();
        System.out.println(" Nhập vào diem ly:  ");
        double diemLy = sc.nextDouble();
        System.out.println(" Nhập vào diem hoa :  ");
        double diemHoa = sc.nextDouble();
        sc.nextLine();
        return new StudentUnivercity(info.getId(),info.getName(),info.getAge(),info.getGpa(),diemToan,diemLy,diemHoa);
    }


    //method input HighSchoolStudent
    public Student inputHighSchoolStudent(){
        StudentInfo info = inputStudent();
        System.out.println("Nhập vào điểm toán");
        double diemToan = sc.nextDouble();
        System.out.println("Nhập vào điểm văn ");
        double diemVan = sc.nextDouble();
        System.out.println(" Nhập vào điểm Anh  ");
        double diemAnh = sc.nextDouble();
        sc.nextLine();
        return new StudentHighSchool(info.getId(),info.getName(),info.getAge(),info.getGpa(),diemToan,diemVan,diemAnh);
    }

}
