package org.example.Lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSinhVien {
    public static void input(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                SinhVien sv = new SinhVien();
                System.out.println("Nhap ma sinh vien : ");
                sv.setMasv(sc.nextLine());
                System.out.println("Nhap ho ten sinh vien : ");
                sv.setHoten(sc.nextLine());
                System.out.println("Nhap diem sinh vien : ");
                sv.setDiem(sc.nextDouble());
                System.out.println("Nhap tuoi sinh vien : ");
                sv.setTuoi(sc.nextInt());
                System.out.println(sv);
                break;
            }catch (InputMismatchException e){
                System.out.println("Nhập dữ liệu không hợp lệ vui lòng nhập đúng");
                sc.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println("❌ " +e.getMessage());
                sc.nextLine();

            }

        }


    }
}
