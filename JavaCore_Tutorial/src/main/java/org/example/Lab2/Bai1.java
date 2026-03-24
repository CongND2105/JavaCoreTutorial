package org.example.Lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên a ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên b ");
        int b = sc.nextInt();
        if(a==0 && b==0){
            System.out.println("Phương trình có vô số nghiệm");
        }else if(a==0 && b!=0){
            System.out.println("Phương trình vô nghiệm");
        }else{
            double x =(double) -b/a;
            System.out.println("X =  " +x);
        }
    }
}
