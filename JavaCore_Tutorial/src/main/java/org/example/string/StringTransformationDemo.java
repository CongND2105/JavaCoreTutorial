package org.example.string;

//StringTransformationDemo (Demo biến đổi chuỗi)
public class StringTransformationDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World";

        //cộng chuỗi cơ bản
        String s3 = s1+s2;
        System.out.println("s3 = "+s3);

        //concat cộng chuỗi
        String s4 = s1.concat(s2);
        System.out.println("s4 = " +s4);

        // thay thế chuỗi
        String s5 = s3.replaceAll("Hello","Xin Chao");
        System.out.println("s5 = " +s5);

        // toLowerCase => chuyển đổi toàn bộ chuỗi sang viết thường
        // toUpperCase => chuyển đổi toàn bộ chuỗi sang viết HOA
        String s6 = s5.toLowerCase();
        String s7 = s5.toUpperCase();
        System.out.println("s6 = " +s6);
        System.out.println("s7 = " +s7);

        //trim() => xóa khoảng trắng dư thừa của chuỗi
        String s8 = "   Hello World   ";
        System.out.println(s8.trim());

        // subString() => cắt lấy ra chuỗi con cần lấy
        String s9 ="Hello World , I learning Java in youtube";
        String s10 = s9.substring(14,30);
        String s11 = s9.substring(33);
        System.out.println(s10);
        System.out.println(s11);
    }
}
