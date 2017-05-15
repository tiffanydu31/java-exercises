package org.launchcode.java.Exercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lucke on 5/11/2017.
 */
public class ArrayListEvenSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Integer[] values = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 18};
        numbers.addAll(Arrays.asList(values));
        Integer sum = evenSum(numbers);
        System.out.println(sum);
    }

    public static Integer evenSum(ArrayList<Integer> numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            if (number%2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
