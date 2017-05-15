package org.launchcode.java.Exercises;

import java.util.Scanner;

/**
 * Created by lucke on 5/10/2017.
 */
public class SearchAliceInWonderland {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in = new Scanner(System.in);
        System.out.println("What word would you like to search?");
        String word = in.next();
        if (alice.toLowerCase().contains(word.toLowerCase())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
