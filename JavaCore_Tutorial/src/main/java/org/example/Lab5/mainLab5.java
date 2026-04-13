package org.example.Lab5;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class mainLab5 {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        ArrayList<Double> numbers  = numberService.inputNumber();
        NumberSum numberSum = new NumberSum(numbers);
        System.out.println("Tổng của mảng số thực : " +numberSum.sum());
    }
}
