package org.launchcode.java.Exercises;

import java.util.Scanner;

/**
 * Created by lucke on 5/10/2017.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the rectangle width and height?");
        double width = in.nextDouble();
        double height = in.nextDouble();
        System.out.println("The area of your rectangle is " + width * height);
    }
}
