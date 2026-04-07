package org.example.demo;

import java.lang.reflect.Array;

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

       // Array sort
        int arr[]={9,2,5,1,10,12,634,6,23,21,65,1};
        System.out.println(Arrays.toString(arr));
        // for lồng nhau
        // for i length -1 để tối ưu hoá , vì chỉ cần phần tử kế cuối, nếu ko -1 thì sẽ tốn thêm 1 lần lặp mà nó ko có phan tử phía sau để so sánh
        for(int i = 0 ; i < arr.length-1 ;i++){
            for(int j = i+1; j <arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Mảng đã sắp xếp : " + Arrays.toString(arr));

        
    }


}
