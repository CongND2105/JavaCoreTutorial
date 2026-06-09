package org.example.string.custom;

public class SinhVien implements Comparable<SinhVien> {
    private int maSv;
    private String hoVaTen;
    private String tenLop;
    private double diemTb;

    public SinhVien() {
    }

    public SinhVien(int maSv, String hoVaTen, String tenLop, double diemTb) {
        this.maSv = maSv;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTb = diemTb;
    }

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    @Override
    public String toString(){
        return "Sinh Vien : " + maSv + " ten : " + hoVaTen + " lop : " + tenLop + "diem TB " +diemTb;
    }
    @Override
    public int compareTo(SinhVien o) {
        return (int) (o.getDiemTb() - this.getDiemTb());
    }
}
