package com.example.cmltdstudent.inclassassignment07_ningelb;

/**
 * Created by cmltdstudent on 3/21/17.
 */
public class MathSkill {
    private String skill;
    private int grade;
    private boolean mastery;

    public MathSkill() { } // Empty constructor is needed to read from Firebase

    public MathSkill(String skill, int grade, boolean mastery) {
        this.skill = skill;
        this.grade = grade;
        this.mastery = mastery;
    }

    public String getSkill() {
        return skill;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isMastery() {
        return mastery;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setMastery(boolean mastery) {
        this.mastery = mastery;
    }
}