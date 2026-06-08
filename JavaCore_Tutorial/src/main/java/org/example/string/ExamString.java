package org.example.string;

import java.util.Scanner;

public class ExamString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String s = sc.nextLine();

        //.length lấy ra độ dài chuỗi
        System.out.println("Độ dài chuỗi : "+s.length());

        //charAt(index) lấy ra kí tự tại vị trí
        for(int i = 0 ; i < s.length() ; i++){
            System.out.println("Vị trí : " + i + " = " + s.charAt(i));
        }

        //getChars => lấy ra một chuỗi kí tuwj từ chuôỗi gốc và gắn vào mảng con
        char [] arrayChar = new char[7];
        s.getChars(1,7 + 1,arrayChar,0);
        for (int i = 0 ; i < arrayChar.length ; i++){
            System.out.println("[Mảng Char]Vị trí " + i + " = " + arrayChar[i]);
        }
      // getBytes lấy ra giá trị ACSII của kí tự
        byte [] arrByte = s.getBytes();
        for(byte b : arrByte){
            System.out.println(b);
        }
        //=========================================================================================================================================


    }
}
