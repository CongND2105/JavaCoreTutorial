package org.example.Assignment.controller;

import org.example.Assignment.model.Student;
import org.example.Assignment.model.StudentHighSchool;
import org.example.Assignment.model.StudentInfo;
import org.example.Assignment.model.StudentUnivercity;
import org.example.Assignment.repository.DataStudent;
import org.example.Assignment.service.StudentService;
import org.example.Assignment.view.DisplayListStudents;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeatureChoice {

    DataStudent dataStudent = new DataStudent();
    Scanner sc = new Scanner(System.in);
    StudentService sts= new StudentService(dataStudent.getList());
    DisplayListStudents displayListStudents = new DisplayListStudents();

    public void choiceMain(){
        boolean flag = true ;
        while(flag){
            //hiển thị màn hình chọn dối tượng Student cụ thể . ví dụ : StudentUnivercity or StudentHighSchool
            DisplayListStudents.displayChoiceSchool();
            int role = sc.nextInt();
            //clear buffer
            sc.nextLine();
            switch (role){
                case 1 :
                    //choiceFeatureStudents(role) để xác định được sẽ thực hiện các thao tác với loại Student nào
                    choiceFeatureStudents(role);
                    flag = false;
                    break;
                case 2 :
                    choiceFeatureStudents(role);
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
    //role được truyền vào từ người dùng qua method ChoiceMain
    public void choiceFeatureStudents(int role){
        Class<? extends Student> type;
        //type = 1 method lấy ra được class từ role truyền vào của người dùng
        type = createClassByRole(role);
        boolean flag = true;
        while (flag){
            // hiển thị các tính năng của 1 Student cụ thể
            displayListStudents.displayChoiceFeature(role);
            int choice = sc.nextInt();
            //clear buffer
            sc.nextLine();
            switch (choice){
                case 1 :
                    // hiển thị danh sách 1 Student cụ thể , Univercity or HighSchool
                    List<? extends Student> students = sts.getListStudentByType(sts.findAll(), type);
                    displayListStudents.displayListStudent(students,type);
                    break;
                case 2 :
                    System.out.println("Chức năng thêm mới sinh viên " );
                    Student s = createStudentByRole(role);
                    sts.addStudent(s);
                    System.out.println("Thêm thành công ");
                    break;
                case 3 :
                    System.out.println("Chức năng cập nhật sinh viên");
                    int idUpdate = inputId();
                    Student stUpdate = sts.findStudentById(idUpdate);
                    Student newData = createStudentByRole(role);
                    if(stUpdate == null){
                        System.out.println("Không tìm thấy sinh viên");
                        break;
                    }
                    stUpdate.update(newData);
                    System.out.println("Cập nhật thành công");
                    break;
                case 4 :
                    System.out.println("Chức năng xóa sinh viên ");
                    deleteStudent();
                    break;
                case 5 :
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn đúng chức năng");
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

        switch (role) {
            case 1:
                return StudentUnivercity.class;
            case 2:
                return StudentHighSchool.class;
            default:
                System.out.println("Không có class hợp lệ");
                return null;
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

    //method input id of update Student
    public int inputId(){
        while(true){
            System.out.println("Nhập vào id sinh viên");
            int id = sc.nextInt();
            sc.nextLine();
           if(sts.findStudentById(id) != null){
               return id;
           }
            System.out.println("id không tồn tại trong hệ thống");
        }
    }

    //method delete student
    private void deleteStudent(){
        int idDelete = inputId();
        List<Student> stDelete = sts.findAll();
        Student studentTemp = null;
        for(Student st : stDelete){
            if(st.getId() == idDelete){
                System.out.println("tìm thấy sinh viên cần xóa");
                studentTemp = st;
                break;
            }
        }
        if(studentTemp !=null){
            sts.deleteStudent(studentTemp);
            System.out.println("Xóa thành công");
        }else {
            System.out.println("Không tìm thấy sinh viên");
        }

    }
}


