package org.example.Lab1;

import java.util.Scanner;

public class Bai3 {
    public void hinhLapPhuong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh cua hinh lap phuong : ");
        Double canh = sc.nextDouble();

        //cong thuc the tinh canh lap phuong canh^3
        Double thetich = Math.pow(canh,3);

        //in ra
        System.out.println("The tich cua hinh lap phuong la : " +thetich);
        sc.close();

    }
}
