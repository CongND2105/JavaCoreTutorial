package org.example.Lab9;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputSinhVien {
    Scanner sc = new Scanner(System.in);
    // method input msv
    public void inputMasv(SinhVien sv){
        while(true){
            try{
                System.out.println("nhập mã sinh viên : ");
                sv.setMasv(sc.nextInt());
                sc.nextLine();
                break;
            }catch(InputMismatchException e){
                System.out.println("Nhập dữ liệu không hợp lệ vui lòng nhập đúng");
                sc.nextLine();
            }
            catch (IllegalArgumentException e){
                System.out.println("❌ " +e.getMessage());
            }

        }

    }

    //method input ho ten sinh vien
    public void inputHoTen(SinhVien sv){
        while (true){
            try{
                System.out.println("Nhập họ tên sinh viên : ");
                sv.setHoten(sc.nextLine());
                break;
            }catch (InputMismatchException e){
                System.out.println("Nhập dữ liệu không hợp lệ vui lòng nhập đúng");
            }
        }

    }
    // method nhập điểm

    public void inputDiem(SinhVien sv){
        while (true){
            try{
                System.out.println("Nhâp điểm Sinh Viên : ");
                sv.setDiem(sc.nextDouble());
                sc.nextLine();
                break;
            }catch (InputMismatchException e){
                System.out.println("Nhập dữ liệu không hợp lệ vui lòng nhập đúng");
                sc.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println(" " +e.getMessage());
            }
        }
    }

    // method nhập tuổi

    public void inputTuoi(SinhVien sv){
        while (true){
            try{
                System.out.println("Nhập vào tuổi sinh viên : " );
                sv.setTuoi(sc.nextInt());
                break;
            }catch (InputMismatchException e){
                System.out.println("Nhập dữ liệu không hợp lệ vui lòng nhập đúng");
                sc.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println(" " +e.getMessage());
            }
        }
    }

    public void input(){
        SinhVien sv = new SinhVien();
        inputMasv(sv);
        inputHoTen(sv);
        inputDiem(sv);
        inputTuoi(sv);
        System.out.println(sv);


    }

}
