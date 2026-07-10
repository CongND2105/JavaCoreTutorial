package org.example.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Student> list = new ArrayList<>();

    public Data(){

    }
    public List<Student> getData(){
        list.add(new Student("H001","Cong",2002,9.8));
        list.add(new Student("H002","Nam",1998,6));
        list.add(new Student("H002","Phong",2000,8));
        return list;
    }
    public void saveDataInFile(){
        try{
            File file = new File("/home/kong/Study/JavaCoreTutorial/JavaCore_Tutorial/src/main/java/org/example/filehandling/data.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for(Student st : list){
                oos.writeObject(st);
            }
            oos.flush();
            oos.close();
        }catch (Exception e){
            System.out.println(" " +e.getMessage());
        }

    }

}
