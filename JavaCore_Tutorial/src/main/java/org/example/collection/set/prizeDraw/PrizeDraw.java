package org.example.collection.set.prizeDraw;

import java.util.*;

//3359

public class PrizeDraw {
    Set<String> prizeDrawBox = new HashSet<>();

    public boolean addTicket(String ticket){
        return this.prizeDrawBox.add(ticket);
    }
    public boolean deleteTicket(String ticket){
        return prizeDrawBox.remove(ticket);
    }
    public boolean checkCodeExist(String code){
        return this.prizeDrawBox.contains(code);
    }
    public void deleteAllTicket(){
        this.prizeDrawBox.clear();
    }
    public int quantityOfPrizeDrawTickets(){
        return this.prizeDrawBox.size();
    }
    public void displayAllTicket(){
        System.out.println(Arrays.toString(this.prizeDrawBox.toArray()));
    }
    public String prizeDraw(){
        Random r = new Random();
        int index = r.nextInt(prizeDrawBox.size());
        return (String) this.prizeDrawBox.toArray()[index];

    }

    public void menuPrizeDrawBox(){
            System.out.println("-----------------------------------");
            System.out.println("1. Add code prize draw ");
            System.out.println("2. Delete code prize draw ");
            System.out.println("3. Check code prize draw exist");
            System.out.println("4. Delete all prize draw ticket");
            System.out.println("5. Quantity of prize draw tickets");
            System.out.println("6. Prize Draw !!!!");
            System.out.println("7. Display all ticket prize draw ");
            System.out.println("0. Exit the game");
    }
    public String inputCode(){
        System.out.println("Input code in list prize");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void choice (){
        while(true){
            menuPrizeDrawBox();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    if(addTicket(inputCode())){
                        System.out.println("add ticket successfully");
                    }else{
                        System.out.println("Ticket already exists");
                    }
                    break;
                case 2 :
                    if(deleteTicket(inputCode())){
                        System.out.println("Delete ticket successfully !!!");
                    }else{
                        System.out.println("Delete Eror");
                    }
                    break;
                case 3 :
                    if(checkCodeExist(inputCode())){
                        System.out.println("Code already exists in system prize draw");
                    }else{
                        System.out.println("Not found code");
                    }
                    break;
                case 4 :
                    deleteAllTicket();
                    break;
                case 5:
                    System.out.println("Quatity of prize draw tickets is : " +quantityOfPrizeDrawTickets());
                    break;
                case 6:
                    System.out.println("Ticket with this code win a prize : " +prizeDraw());
                    break;
                case 7 :
                    displayAllTicket();
                    break;
                case 0:
                    System.exit(0);

            }
        }

    }

}
