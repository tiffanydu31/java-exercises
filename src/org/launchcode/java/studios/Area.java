package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by lucke on 5/10/2017.
 */
public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double radius;
        do {
            System.out.println("What is the radius?");
            radius = in.nextDouble();
        } while (radius < 0);
        System.out.println("The area of the circle is: " + 3.14 * radius * radius);
    }
}
