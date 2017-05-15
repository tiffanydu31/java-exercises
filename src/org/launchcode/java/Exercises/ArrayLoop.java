package org.launchcode.java.Exercises;

/**
 * Created by lucke on 5/11/2017.
 */
public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        printArray(numbers);
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
