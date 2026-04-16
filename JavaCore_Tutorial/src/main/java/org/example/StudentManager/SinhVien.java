package org.example.StudentManager;

abstract class SinhVien {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;
    @Override
    public String toString() {
        return "Sinh Vien :" + name + " id " + id + " price " + price + " tax " + tax + " Thue : " +getPriceTax();
    }
    public SinhVien(String id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public SinhVien() {}

    abstract protected double getPriceTax();
    abstract protected double getDiem();
    abstract protected String display();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
