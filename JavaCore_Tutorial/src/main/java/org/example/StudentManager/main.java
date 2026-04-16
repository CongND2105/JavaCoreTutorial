package org.example.StudentManager;

public class main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVienIT("1", "Nguyen Van A", 20,0.2,"Java",8,9);
        System.out.println(sv);
        SinhVien sv2 = new SinhVienCoKhi(  "2", "Nguyen Van teo",20,0.3,"CNC",7,6);
        System.out.println(sv2);
        System.out.println(sv.display());
        System.out.println(sv2.display());

    }
}
