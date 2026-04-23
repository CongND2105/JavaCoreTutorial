package org.example.Lab9;

public class DemoException {
    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println("ket qua : " +result);
        } catch (Exception e) {
            System.out.println("oi co loi gi do roi : " +e.getMessage());
        }finally {
            System.out.println("Khoi try-catch da ket thuc ");
        }
    }
}
