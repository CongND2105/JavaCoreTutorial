package org.example;

import org.example.Lab1.Bai1;
import org.example.Lab1.Bai2;
import org.example.Lab1.Bai3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao bai tap ban muon hoat dong (co 3 bai) 1 or 2 or 3 ? : ");
        int bai = sc.nextInt();
        if(bai==1){
            Bai1 bai1 = new Bai1();
            bai1.bai1();
        } else if (bai==2) {
            Bai2 bai2 = new Bai2();
            bai2.hinhChuNhat();
        } else if (bai==3) {
            Bai3 bai3 = new Bai3();
            bai3.hinhLapPhuong();
        }
        sc.close();




    }
}