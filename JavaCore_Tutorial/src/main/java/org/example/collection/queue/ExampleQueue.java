package org.example.collection.queue;

import java.util.LinkedList;
import java.util.Queue;


//Queue vào trước ra trước
public class ExampleQueue {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList<>();
        list.offer("Nguyen Van A");
        list.offer("Nguyen Van B");
        list.offer("Nguyen Van C");
        list.offer("Nguyen Van D");
        while (true) {
            String ten = list.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);

        }
    }
}
