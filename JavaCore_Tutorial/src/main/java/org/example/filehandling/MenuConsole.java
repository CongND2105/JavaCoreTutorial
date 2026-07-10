package org.example.filehandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuConsole {
    StudentList list = new StudentList();
    Scanner sc = new Scanner(System.in);
    public void menu(){
        System.out.println("===============================================");
        System.out.println("1. Add Student in List");
        System.out.println("2. Print Student List");
        System.out.println("3. Check Student List is empty");
        System.out.println("4. Get quantity in List");
        System.out.println("5. Make list is empty");
        System.out.println("6. Check the Student in list by ID");
        System.out.println("7. Delete Student in List by ID");
        System.out.println("8. Search for all Student by name entered via the keyboard"); // entered via the keyboard : được nhập qua bàn phím
        System.out.println("9. Print a list of all students, sorted by score form highest to lowest");
        System.out.println("10. Save a List of Student for file");
        System.out.println("0. Exit");
        System.out.println("===============================================");
    }

    public void start(){
        int choice =0;
        do{
            menu();
            System.out.print("Select feature : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    list.addStudent(addSt());
                    System.out.println("Add Student Succesfully");
                    break;
                case 2 :
                    System.out.println(list.getList());
                    break;
                case 3 :
                    System.out.println("Is the list of students empty ? : " + list.checkListEmpty());
                    break;
                case 4 :
                    System.out.println("Quantity of list : " +list.getQuantity());
                    break;
                case 5 :
                    list.makeListEmpty();
                    System.out.println("The list has been Empty.");
                    break;
                case 6 :
                     String id = getId();
                     if(list.studentExists(id) !=null){
                         System.out.println("Student exists in List : " + list.studentExists(id));
                     }else{
                         System.out.println("Not Found");
                     }
                     break;
                case 7:
                     if(list.deleteStudentById(getId())){
                         System.out.println("Student has been delete");
                     }else{
                         System.out.println("Not Found");
                     }
                     break;
                case 8:
                    String keyword = getEnterFromKeyboard();
                    System.out.println("Search results : " + list.listStudentByName(keyword));
                    break;
                case 9:
                    System.out.println(list.sortStudent());
                    break;
            }
            
        }while(choice!= 0);
    }

    public Student addSt(){
        String id = getId();
        System.out.println("Enter student name : ");
        String name = sc.nextLine();
        System.out.println("Enter student year of birth : ");
        int yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student average score : ");
        double averageScore = sc.nextDouble();
        sc.nextLine();
        return new Student(id,name,yearOfBirth,averageScore);
    }
    public String getId(){
        System.out.println("Enter Student id :");
        return sc.nextLine();
    }
    public String getEnterFromKeyboard(){
        System.out.print("Enter keyword for search : ");
        return sc.nextLine();
    }
}
