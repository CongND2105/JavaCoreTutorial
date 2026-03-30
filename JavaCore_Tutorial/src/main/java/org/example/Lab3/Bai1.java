package org.example.Lab3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên bất kỳ : ");
        int value =sc.nextInt();
        int count = 0 ;
        //Bắt đầu từ i = 2 => i = 0 ( 0/0 ném ra lỗi), số nguyên nào cũng có thể chia hết cho 1
        for(int i = 2 ; i < value; i++){
           if(value%i==0){
               System.out.println("ước số khác : " +i);
               count ++ ;
           }
        }
        if(count==0){
            System.out.printf("%d là số nguyên tố",value);
        }else{
            System.out.printf("%d không phải là số nguyên tố ", value);

        }
    }
}
