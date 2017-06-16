package org.launchcode.java.Exercises.school;

/**
 * Created by lucke on 5/22/2017.
 */
public class Student {
    private final String name;
    private final int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String n, int i, int c, int g) {
        name = n;
        studentId = i;
        numberOfCredits = c;
        gpa = g;
    }

    public Student(String n, int i) {
        this(n, i, 0, 0);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    // calculate number of credits based on number of classes passed
    private void setNumberOfCredits(int credits) {
        numberOfCredits = credits;
    }

    public double getGpa() {
        return gpa;
    }

    public void addGrade(int grade, int credits) {
        gpa = ((gpa * numberOfCredits) + (grade * credits)) / (numberOfCredits + credits);
        numberOfCredits = numberOfCredits + credits;
    }

    public String getGradeLevel() {
        if (numberOfCredits < 30) {
            return "freshman";
        } else if (numberOfCredits < 60) {
            return "sophomore";
        } else if (numberOfCredits < 90) {
            return "junior";
        } else {
            return "senior";
        }
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

}
