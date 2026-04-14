package org.example.Lab6;

import java.util.Scanner;

public class AuthService {
    public void activeAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào username : ");
        String username = sc.nextLine();
        System.out.println("Nhập vào password : ");
        String password = sc.nextLine();
        if(username.equals("hoidanit") && password.length()>6){
            System.out.println("Account hop le ");
        }else{
            System.out.println("username khong dung hoac password khong du 6 ki tu");
        }
    }
}
