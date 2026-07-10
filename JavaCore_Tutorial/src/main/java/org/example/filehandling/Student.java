package org.example.filehandling;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String id ;
    private String name;
    private int yearOfBirth;
    private double averageScore;

    public Student (){

    }
    public Student (String id, String name, int yearOfBirth, double averageScore){
        this.id = id;
        this.name = name ;
        this.yearOfBirth = yearOfBirth;
        this.averageScore = averageScore;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
    public void setAverageScore(double averageScore){
        this.averageScore = averageScore;
    }
    public double getAverageScore(){
        return this.averageScore;
    }

    @Override
    public String toString(){
        return "id = "+ id + " | name = " + name + " | Year of Birth = " +yearOfBirth + " | average Score " + averageScore +"\n";
    }

    @Override
    public int compareTo(Student o) {
        return (int) (o.averageScore - this.averageScore);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Student st = (Student) o;
        return this.id.equals(st.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
