package org.example.filehandling;

import java.util.Scanner;

public class MenuConsole {
    StudentList list = new StudentList();
    Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("===============================================");
        System.out.println("1. Add Student in List");
        System.out.println("2. Print Student List");
        System.out.println("3. Check Student List is empty");
        System.out.println("4. Get quantity in List");
        System.out.println("5. Make list is empty");
        System.out.println("6.Check the Student in list by ID");
        System.out.println("7. Delete Student in List by ID");
        System.out.println("8. Search for all Student by name entered via the keyboard"); // entered via the keyboard : được nhập qua bàn phím
        System.out.println("9. Print a list of all students, sorted by score form highest to lowest");
        System.out.println("10. Save a List of Student for file");
        System.out.println("0. Exit");
        System.out.println("===============================================");
        input();
    }

    public void input(){
        int choice =0;
        do{
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
//                    list.addStudent();
                    break;
                case 2 :
                    System.out.println(list.getList());
                    break;
                case 8:
                    System.out.println("I'm here");
                    System.out.println(list.listStudentByName("o"));
                    break;
                case 9:
                    System.out.println(list.sortStudent());
                    break;
            }
            
        }while(choice!= 0);
    }
}
