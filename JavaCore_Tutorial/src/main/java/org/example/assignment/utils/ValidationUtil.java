package org.example.assignment.utils;

public class ValidationUtil {
    //check scores
    public static void checkGpa(double gpa) {
        if (gpa >10 || gpa <=0) {
            throw new IllegalArgumentException("Điểm không hợp lệ vui lòng nhập chính xác !!!");
        }
    }

    //check age
    public static void checkAge(int age){
        if(age <0 || age >=100){
            throw new IllegalArgumentException("Tuổi không hợp lệ vui lòng nhập lại");
        }
    }

}
