package org.example.filehandling;

public class ObjectFileWriteMain {
    public static void main(String[] args){
        MenuConsole.start();
        Data data = new Data();
        StudentList list = new StudentList(data.getData());
        System.out.println(list.getList());

    }
}
