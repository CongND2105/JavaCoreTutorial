package org.example.Lab1;

import java.util.Scanner;

public class Bai2 {
    public void hinhChuNhat(){

        //khai bao Scanner va nhap so lieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai cua hinh chu nhat : ");
        double cDai = sc.nextDouble();
        System.out.println("Nhap vao chieu rong cua hinh chu nhat : ");
        double cRong= sc.nextDouble();

        //cong thuc
        double min = Math.min(cDai,cRong);
        double chuvi = (cDai+cRong)*2;
        double dienTich = cDai*cRong;


        // in ra man hinh
        System.out.println("Chu vi cua hinh chu nhat : " +chuvi);
        System.out.println("dien tich cua hinh chu nhat : " +dienTich);
        System.out.println("Canh nho nhat cua hinh chu nhat la  : " +min);
        // dong Scanner de tranh ro ri bo nho
//        sc.close();


    }
}
