package org.example.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " +(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mảng đã được sắp xếp : " +Arrays.toString(arr));
        int max = arr[0] ;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        int min = arr[0] ;
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        System.out.println("Phần tử lớn nhât trong mảng : " +max );
        System.out.println("Phần tử nhỏ nhât trong mảng : " +min );
    }
}
