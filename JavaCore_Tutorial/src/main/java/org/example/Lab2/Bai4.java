package org.example.Lab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner sc = new Scanner(System.in);
        String chon =sc.nextLine();

        switch (chon) {
            case "1":
                Bai1 bai1 = new Bai1();
                bai1.nghiemBacNhat();
                break;
            case "2" :
                Bai2 bai2 = new Bai2();
                bai2.phuongTrinh();
                break;
            case "3":
                Bai3 bai3 = new Bai3();
                bai3.tinhTienDien();
                break;
            case "4":
                System.exit(0);

        }
    }
}
