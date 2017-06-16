package org.launchcode.java.Exercises.school;

import java.util.ArrayList;

/**
 * Created by lucke on 5/22/2017.
 */
public class Course {
    private String courseName;
    private int credits;
    private String professor;
    private final ArrayList<Student> students = new ArrayList<Student>();

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int creditValue) {
        credits = creditValue;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String profName) {
        professor = profName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudents(Student s) {
        students.add(s);
    }

    public String toString() {
        return courseName + "(Credits: " + credits + ", Professor: " + professor + ")";
    }
}
