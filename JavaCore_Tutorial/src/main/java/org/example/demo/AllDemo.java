package org.example.demo;

public class AllDemo {

    // ví dụ về static method và non-static
    static void hello(){
        System.out.println("hello");
    }
    void hello2(){
        System.out.println("hello2");
    }
    public static void main(String[] args) {
       AllDemo.hello();
       AllDemo demo = new AllDemo();
       demo.hello2();
    }


}
