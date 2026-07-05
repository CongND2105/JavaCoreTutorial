package org.example.collection.map.treemap;

import java.util.Scanner;

public class DictionaryInput {
    Dictionary dictionary = new Dictionary();
    DisplayDictionary displayDictionary = new DisplayDictionary();
    Scanner sc = new Scanner(System.in);
    public void start(){
        int choice;
        do {
            displayDictionary.display();
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    dictionary.addDictionary(inputKeyWord(),inputMeaning());
                    break;
                case 2 :
                    dictionary.deleteDictionary(inputKeyWord());
                    break;
                case 3:
                    String keyword = inputKeyWord();
                    System.out.println("Meaning of " + keyword+ " is : " + dictionary.lookUpDictionary(keyword));
                    break;
                case 4 :
                    dictionary.printKeyWordinDictionaryList();
                    break;
                case 5:
                    System.out.println("Dictionary Count is : " + dictionary.getDictionaryCount());
                    break;
                case 6 :
                    dictionary.deleteAllDictionary();
                    break;
                case 7 :
                    System.exit(0);
            }
        }while (true);
    }

    public String inputKeyWord(){
        System.out.println("Input keyword : ");
        return sc.nextLine();
    }
    public String inputMeaning(){
        System.out.println("Input meaning : ");
        return sc.nextLine();
    }
}
