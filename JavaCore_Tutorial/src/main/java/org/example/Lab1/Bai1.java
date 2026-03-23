package org.example.Lab1;

import java.util.Scanner;

public class Bai1 {
   public void bai1(){
       Scanner sc =new Scanner(System.in);
       System.out.println("Nhap vao ho ten cua sinh vien : ");
       String name = sc.nextLine();
       System.out.println("Nhap vao so diem trung binh cua sinh vien");
       Double avgScore = sc.nextDouble();
       System.out.println("Diem trung binh cua sinh vien : " +name + "la : " +avgScore);
//       sc.close();
   }
}
