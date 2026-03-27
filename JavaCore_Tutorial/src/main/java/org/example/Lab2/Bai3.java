package org.example.Lab2;

import java.util.Scanner;

public class Bai3 {
    public void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số điện : ");
        int n = sc.nextInt();
        double money = 1000;
        if(n <=100){
            double total = n*money;
            System.out.println("Tổng tiền điện của bạn là : " +total);
        }else{
            double total = 100 * money + (n -100)*1500;
            System.out.println("Tổng tiền điện của bạn là : " +total);
        }
    }
}
