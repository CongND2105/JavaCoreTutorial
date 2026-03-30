package org.example.demo;

import java.util.Arrays;

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

       // Array Sort
        int[] a = { 10, 5, 20, 30, 1, 3, 69, 12, 2 };
        for(int i=0;i<a.length-1 ;i++){
            for(int j= i + 1;j<a.length;j++){
                if(a[i] > a[j]){
                   int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("a = " + Arrays.toString(a));
        }


    }


}
