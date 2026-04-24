package org.example.Lab9;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;

public class SinhVien {
    private int masv;
    private String hoten;
    private double diem;
    private int tuoi;

    @Override
    public String toString() {
        return "SinhVien{" +
                "masv='" + masv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", diem=" + diem +
                ", tuoi=" + tuoi +
                '}';
    }

    public SinhVien() {
    }

    public SinhVien(int masv, String hoten, double diem, int tuoi) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.tuoi = tuoi;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        if(isValidName(hoten)){
            this.hoten = hoten;
        }else
            throw new InputMismatchException();

    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        if(diem< 0 || diem >10){
            throw new IllegalArgumentException("điểm không hợp lệ vui lòng nhập 1-10");
        }
        this.diem = diem;


    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi< 0 ||tuoi >100){
            throw new IllegalArgumentException("tuổi không hợp lệ vui lòng nhập lại chính xác");
        }else{
            this.tuoi = tuoi;
        }

    }
    //validate hoten
    public static boolean isValidName(String name) {
        return name.matches("[a-zA-ZÀ-ỹ\\s]+");
    }
}
