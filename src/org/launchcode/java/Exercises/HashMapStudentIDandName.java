package org.launchcode.java.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lucke on 5/11/2017.
 */
public class HashMapStudentIDandName {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);

        String student = " ";
        while (!student.equals("")) {
            System.out.print("Please enter student (or Enter to finish): ");
            student = in.nextLine();
            if (!student.equals("")) {
                System.out.print("Please enter student ID: ");
                int id = in.nextInt();
                students.put(id, student);
                in.nextLine();
            }
        }

        System.out.println("\nClass roster");
        for (Map.Entry<Integer, String> studentEntry : students.entrySet()) {
            System.out.println(studentEntry.getKey() + " " + studentEntry.getValue());
        }
    }
}
