package org.example.demo;

import java.util.Arrays;

public class JavaUtils {
    public static void countFrequency(int[] a) {
        int n = a.length; // độ dài mảng
        int visited[] = new int[n];       // khai báo 1 mảng boolean vs độ dài bằng mảng a
        System.out.println(Arrays.toString(visited));
        for (int i = 0; i < n; i++) {
            if (visited[i]<0) continue;        // nếu đã true (được đếm rồi) thì bỏ qua luôn
            int count = 1;   // taoj 1 biến count để đếm giá trị và bắt đầu bằng 1 vì nó xuất hiện lần đầu tiên
            for (int j = i + 1; j < n; j++) {            // vòng lặp thì 2 bắt đầu với i + 1 (số đằng trước của i để so sánh)
                if (a[i] == a[j]) {                   // nếu = thì tăng biến count lên 1 và set visited = true để ko đếm lặp
                    count++;
                    visited[j] = -1;
                }

            }
            System.out.println(a[i] + " Xuat hien " + count + "lan");
        }

    }
}