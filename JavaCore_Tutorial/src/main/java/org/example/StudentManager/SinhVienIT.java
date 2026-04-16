package org.example.StudentManager;

public class SinhVienIT extends SinhVien {
    private String language;
    private double scoreJava;
    private double scoreHTML;

    public SinhVienIT(String id, String name , double price, double tax,String language,double scoreJava, double scoreHTML) {
        super(id, name, price, tax);
        this.language = language;
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    @Override
    public String toString() {
        return super.toString() + " Sinh Vien IT " + " language=" + language + " scoreJava=" + scoreJava + " scoreHTML=" + scoreHTML;
    }
    @Override
    public double getPriceTax() {
        return this.tax* this.price;
    }
    @Override
    public double getDiem(){
        return (this.scoreJava * 2 + this.scoreHTML)/3;
    }
    @Override
    public String display(){
//        System.out.println("Tong diem : " +this.getDiem());
        return super.toString()+ "Tong diem : " +this.getDiem();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
