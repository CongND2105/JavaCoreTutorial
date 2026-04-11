package org.example.Lab4;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    // nhập thông tin
     public Product nhapThongTin(String name, double price , double tax) {
        Product product = new Product(name, price, tax);
        return product;
     }
     public void xuatThongTin(Product product) {
         System.out.println("Ten san pham : " + product.getName() + " gia san pham : " + product.getPrice() + " thue : " + product.getTax());
         System.out.println("thue cua san pham : " +getTaxPrice(product.getPrice(), product.getTax()));
     }
     public double getTaxPrice(double price, double tax){
        return  price * tax;
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
