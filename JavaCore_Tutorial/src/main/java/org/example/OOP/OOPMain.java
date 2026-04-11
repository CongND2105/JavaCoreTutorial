package org.example.OOP;

public class OOPMain {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.learnIT();
        st1.setName("Cong");
        st1.setAge(20);
        System.out.println("Tên sinh vien : " + st1.getName() + " tuổi : " + st1.getAge());
        Student st2 = new Student();
        st2.Student("Nguyen Van Teo", 24);
        System.out.println("Ten sinh vien : " +st2.getName());

    }
}
