package org.example.Lab2;

import java.util.Scanner;

public class Bai2 {

    private static void phuongTrinhBacNhat(int a, int b){
        if(a==0 && b==0){
            System.out.println("Phương trình có vô số nghiệm");
        }else if(a==0 && b!=0){
            System.out.println("Phương trình vô nghiệm");
        }else{
            double x =(double) -b/a;
            System.out.println("X =  " +x);
        }
    }

    public void phuongTrinh() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên a : ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số nguyên b : ");
        int b = sc.nextInt();
        System.out.println("Nhập vào số nguyên c : ");
        int c = sc.nextInt();
        //công thức tính delta = b^2-4ac;
        double delta = b * b - 4 * a * c;
        if(a==0){
            phuongTrinhBacNhat(b,c);
        }else if(a != 0){
            delta = b * b - 4 * a * c;
            if(delta < 0){
                System.out.println("phương trình vô nghiệm");
            }else if(delta == 0){
                double x = -b/(2*a);
                System.out.println("Nghiệm kép x = " +x);
            }else{
                double x1= (-b + Math.sqrt(delta))/(2*a);
                double x2= (-b - Math.sqrt(delta))/(2*a);
                System.out.println("phương trình có 2 nghiệm riêng biệt x1 = " + x1 + " x2 = " + x2 );
            }
        }

    }
}
