package org.example.OOP;

public class OOPMain {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.learnIT();
        st1.setName("Cong");
        st1.setAge(20);
        System.out.println("Tên sinh vien : " + st1.getName() + " tuổi : " + st1.getAge());

    }
}
