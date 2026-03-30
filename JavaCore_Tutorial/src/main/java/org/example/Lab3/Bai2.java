package org.example.Lab3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        //bảng cửu chương
        for(int i = 2 ; i < 10 ; i ++){
            for(int j = 1 ; j < 10 ; j++){
                System.out.printf("%d * %d = %d \n" , i, j , i* j);
            }
        }
    }
}
