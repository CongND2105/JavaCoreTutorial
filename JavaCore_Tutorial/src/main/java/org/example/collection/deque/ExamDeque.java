package org.example.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExamDeque {
    public static void main (String [] name){
        Deque<String> list = new ArrayDeque<>();
        list.offer("Nguoi choi 1 ");
        list.offer("Nguoi choi 2 ");
        list.offer("Nguoi choi 3 ");
        list.offer("Nguoi choi 4 ");
        list.offerFirst("Nguoi choi 5");
        list.offerLast("Nguoi choi 6");
        while(true){
            String ten = list.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }


    }
}
