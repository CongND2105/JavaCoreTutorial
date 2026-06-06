package org.example.collection.priorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// tự động sắp xếp danh sách

public class ExamPriorityQueue {
    public static void main(String[] args) {
        Queue<String> list = new PriorityQueue<>();
        list.offer("Nguyen Van D");
        list.offer("Nguyen Van A");
        list.offer("Nguyen Van C");
        list.offer("Nguyen Van B");
        list.offer("Oke Bads");
        while (true) {
            String ten = list.poll();
            if (ten == null) {
                break;
            }
            System.out.println(ten);

        }
    }
}
