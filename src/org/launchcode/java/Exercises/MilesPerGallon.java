package org.launchcode.java.Exercises;

import java.util.Scanner;

/**
 * Created by lucke on 5/10/2017.
 */
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much gas have you used (gallons)?");
        double gallon = in.nextDouble();
        System.out.println("How many far have you driven (miles)?");
        double miles = in.nextDouble();
        System.out.println("Miles per gallon: " + miles / gallon);
    }
}
