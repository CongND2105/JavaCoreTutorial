package org.example.string;

public class StringSearchExam {
    public static void main (String [] args){
        String st1 =  "Xin Chào anh chị, xin chào các em, Xin Chào";
        String st2 = "Xin Chào";
        String st3 = "Xin Chào helios";
        char c = 'ị';

        //indexOf tìm kiếm vị trí từ trái sang phải
        System.out.println("[tìm kiếm st2 trong st1] : " + st1.indexOf(st2));
        System.out.println("[tìm kiếm st3 trong st1] : " + st1.indexOf(st3));

        // sử dụng vị trí bắt đầu
        System.out.println("[tìm kiếm st2 trong st1 (from index)] : " + st1.indexOf(st2,20));

        //tìm kiếm char
        System.out.println("Vị trí của c trong st1 : " + st1.indexOf(c));
        System.out.println("Vị trí của c trong st2 : " + st2.indexOf(c));

        // lastIndexOf tìm kiếm từ phải sang trái
        System.out.println("[tìm kiếm st2 trong st1 {lastIndexOf}] : " + st1.lastIndexOf(st2));
    }
}
