package org.example.Lab5;

import java.util.ArrayList;

public class NumberService {
    public ArrayList<Double> inputNumber(){
        ArrayList<Double> numbers = new ArrayList<>();
        boolean flag = true;
        while(flag){
            System.out.println("Nhập vào số thực : ");
            numbers.add(Utils.sc.nextDouble());
            Utils.sc.nextLine();
            flag = CheckBooleanChoice.checkChoice();
        }
//        System.out.println(numbers);
        return numbers;
    }
}
