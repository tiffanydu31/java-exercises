package org.launchcode.java.Exercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lucke on 5/11/2017.
 */
public class ArrayListFiveLetterWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(
                Arrays.asList("one", "two", "three", "five", "four", "six", "seven", "eight", "nine"));
        printFiveLetterWords(words);

    }
    public static void printFiveLetterWords(ArrayList<String> words) {
        for(String word : words) {
            if (word.length() == 5){
                System.out.println(word);
            }
        }
    }
}
