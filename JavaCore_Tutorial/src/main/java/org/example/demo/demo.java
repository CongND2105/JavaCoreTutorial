package org.example.demo;

import javax.swing.plaf.IconUIResource;

public class demo {
    public static void main(String[] args) {
        int a[]={2,2,4,4,5,2,5,1,2,6,6,7,8,7};
        // tần suất xuất hiện của các phần tử
        int n = a.length; // độ dài mảng
        boolean visited[] = new boolean[n];       // khai báo 1 mảng boolean vs độ dài bằng mảng a

        for(int i = 0 ; i < n ; i++){
            if(visited[i]) continue;        // nếu đã true (được đếm rồi) thì bỏ qua luôn
            int count = 1 ;   // taoj 1 biến count để đếm giá trị và bắt đầu bằng 1 vì nó xuất hiện lần đầu tiên
            for(int j = i+1 ; j < n ; j++){            // vòng lặp thì 2 bắt đầu với i + 1 (số đằng trước của i để so sánh)
                if(a[i] == a[j]){                   // nếu = thì tăng biến count lên 1 và set visited = true để ko đếm lặp
                    count ++;
                    visited[j] = true;
                }

            }
            System.out.println(a[i] + " Xuat hien " +count + "lan");
        }

    }
}
