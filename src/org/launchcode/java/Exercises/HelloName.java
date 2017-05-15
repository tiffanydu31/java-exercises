package org.launchcode.java.Exercises;

import java.util.Scanner;

/**
 * Created by lucke on 5/10/2017.
 */
public class HelloName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = in.next();
        System.out.println("Hello " + name + "!");
    }
}
