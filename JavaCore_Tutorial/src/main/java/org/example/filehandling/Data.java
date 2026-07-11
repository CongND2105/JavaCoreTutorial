package org.example.filehandling;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {
    List<Student> list = new ArrayList<>();
    public static final String JSON_FILE ="/home/kong/Study/JavaCoreTutorial/JavaCore_Tutorial/src/main/java/org/example/filehandling/students.txt";
    public Data(){

    }
    public List<Student> getData(){
        list.add(new Student("H001","Cong",2002,9.8));
        list.add(new Student("H002","Nam",1998,6));
        list.add(new Student("H002","Phong",2000,8));
        return list;
    }

    public void studentJSONReader() throws IOException {
        InputStream fis = new FileInputStream(JSON_FILE);

        //create JSONReader object
        JsonReader jsonReader = Json.createReader(fis);

        //get JsonObject form JsonReader
        JsonObject jsonObject = jsonReader.readObject();
        System.out.println(jsonObject);
        //we can close IO resource and Jsonreader now
        jsonReader.close();
        fis.close();
    }

}
