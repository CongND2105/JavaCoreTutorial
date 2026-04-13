package org.example.Lab5;

import java.util.ArrayList;

public class NumberSum {
    private ArrayList<Double> numbers;
    public NumberSum(ArrayList<Double> numbers) {
        this.numbers = numbers;
    }

    public double sum(){
        double total = 0 ;
        for(int i = 0 ; i < numbers.size() ; i++){
            total += numbers.get(i);
        }
        return total;
    }

}
