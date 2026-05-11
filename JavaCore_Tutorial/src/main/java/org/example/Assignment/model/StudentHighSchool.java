package org.example.Assignment.model;

import org.example.Assignment.utils.ValidationUtil;

import java.util.Scanner;

public class StudentHighSchool extends Student {
    private double scoreMath; // điểm toán
    private double scoreLiterature; // điểm ngữ văn
    private double scoreEnglish;  // điểm tiếng anh

    public StudentHighSchool(int id, String name, int age, double gpa, double scoreMath, double scoreLiterature, double scoreEnglish) {
        super(id, name, age, gpa);
        this.scoreMath = scoreMath;
        this.scoreLiterature = scoreLiterature;
        this.scoreEnglish = scoreEnglish;
    }

    @Override
    public String toString() {
        return super.toString() + " điểm toán : " + this.scoreMath + " điểm văn : " + this.scoreLiterature + " điểm Anh : " + this.scoreEnglish +"\n";
    }

    public StudentHighSchool(int id, String name, int age, double gpa) {
        super(id, name, age, gpa);
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        ValidationUtil.checkGpa(scoreMath);
        this.scoreMath = scoreMath;
    }

    public double getScoreLiterature() {
        return scoreLiterature;
    }

    public void setScoreLiterature(double scoreLiterature) {
        ValidationUtil.checkGpa(scoreLiterature);
        this.scoreLiterature = scoreLiterature;
    }

    public double getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreEnglish(double scoreEnglish) {
        ValidationUtil.checkGpa(scoreEnglish);
        this.scoreEnglish = scoreEnglish;
    }

    @Override
    protected double averageGpa() {
        return (this.gpa + this.scoreMath + this.scoreLiterature + this.scoreEnglish)/4;
    }

    @Override
    public void update(Student student) {
       this.name = student.getName();
    }
}
