package org.example.StudentManager;

public class SinhVienCoKhi extends SinhVien {
    private String skill;
    private double scoreCNC;
    private double scorePLC;
    public SinhVienCoKhi(String id, String name, double price, double tax, String skill, double scoreCNC, double scorePLC) {
        super(id, name, price, tax);
        this.skill = skill;
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    @Override
    public String toString() {
        return super.toString() + " SinhVienCoKhi{" + "skill=" + skill + '}' + "diem CNC" + scoreCNC + " diem PLC" + scorePLC;
    }
    @Override
    public double getPriceTax() {
        return this.tax* this.price;
    }
    @Override
    public double getDiem() {
        return (this.scoreCNC + this.scorePLC)/2;
    }
    @Override
    public String display() {
        return super.toString()+ "Tong diem : " +this.getDiem();
    }

    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
}
