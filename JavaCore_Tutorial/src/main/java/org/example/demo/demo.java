package org.example.demo;

import javax.swing.plaf.IconUIResource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class demo {
    public static void main(String[] args) throws IOException {
//        int a[]={2,2,4,4,5,2,5,1,2,6,6,7,8,7};
//        JavaUtils.countFrequency(a);
        int[] a ={} ;
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
        FileInputStream in = new FileInputStream("alo.txt");
        int c = in.read();

        input(10.5);

    }
    public static void input(Object obj){
        System.out.println("Day la doi tuong " +obj);
    }
}
