package org.example.Assignment.Service;

import java.util.Scanner;

public class FeatureChoice {
    Scanner sc = new Scanner(System.in);
    DisplayListStudents displayListStudents = new DisplayListStudents();
    boolean flag = true ;
    public void choiceMain(){
        while(flag){
            DisplayListStudents.displayChoiceSchool();
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    DisplayListStudents.displayChoiceFeature();
                    flag = false;
                    break;
                case 2 :
                    DisplayListStudents.displayChoiceFeature();
                    flag = false;
                    break;
                case 3 :
                    System.exit(0);
                default:
                    System.out.println("Vui Lòng chọn đúng số");
            }

        }


    }
}
