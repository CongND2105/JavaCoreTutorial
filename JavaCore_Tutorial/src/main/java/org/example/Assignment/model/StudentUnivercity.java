package org.example.Assignment.model;

import org.example.Assignment.utils.ValidationUtil;

import java.util.Scanner;

public class StudentUnivercity extends Student{
    private double scoreMath;  // điểm môn toán
    private double scorePhysics; // điểm môn Lý
    private double scoreChemistry; //điểm môn hóa

    @Override
    public String toString() {
        return super.toString() + " điểm toán : " +scoreMath + "điểm lý : " +scorePhysics + " điểm hóa : " +scoreChemistry +"\n";
    }
     public double averageGpa(){
        return (this.gpa + this.scoreMath + this.scorePhysics + this.scoreChemistry)/3;
    }

    @Override
    public void update(Student student) {
        this.name = student.getName();
    }

    public StudentUnivercity(int id, String name, int age, double gpa) {
        super(id, name, age, gpa);
    }

    public StudentUnivercity(int id , String name , int age , double gpa , double scoreMath, double scorePhysics, double scoreChemistry) {
        super(id,name,age,gpa);
        this.scoreMath = scoreMath;
        this.scorePhysics = scorePhysics;
        this.scoreChemistry = scoreChemistry;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        ValidationUtil.checkGpa(scoreMath);
        this.scoreMath = scoreMath;
    }

    public double getScorePhysics() {
        return scorePhysics;
    }

    public void setScorePhysics(double scorePhysics) {
        ValidationUtil.checkGpa(scorePhysics);
        this.scorePhysics = scorePhysics;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        ValidationUtil.checkGpa(scoreChemistry);
        this.scoreChemistry = scoreChemistry;
    }
}
