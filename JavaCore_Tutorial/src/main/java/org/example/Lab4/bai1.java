package org.example.Lab4;

public class bai1 {
    public static void main(String[] args) {
        Product pr = new Product();
        Product product = pr.nhapThongTin("Cong", 20,2);
        pr.xuatThongTin(product);
    }
}
