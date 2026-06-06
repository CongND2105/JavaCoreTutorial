package org.example.collection.stack;

import java.util.Stack;

//Stack vào sau ra trước

public class ExamStack {
    public static void main(String[] args){
        Stack<String> listName = new Stack<>();
        listName.push("Nguyen Van A");
        listName.push("Nguyen Van B");
        listName.push("Nguyen Van C");
        listName.push("Nguyen Van D");
        listName.push("Nguyen Van E");
        listName.push("Nguyen Van F");
        listName.push("Nguyen Van G");
        listName.push("Nguyen Van H");
        int n = listName.size();
        for(int i = 0 ; i < n ; i++){
            String ten = listName.pop();
            System.out.println(ten);
        }
    }
}
