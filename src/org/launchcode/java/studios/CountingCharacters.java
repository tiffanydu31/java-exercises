package org.launchcode.java.studios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lucke on 5/11/2017.
 */
public class CountingCharacters {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("C:\\Users\\lucke\\Documents\\LC101\\Java\\java-exercises\\resources\\counting_characters.txt"));
            String passage = in.nextLine();
            count(passage);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void count(String input) {
        String lowerCaseInput = input.toLowerCase();
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            if (Character.isLetter(lowerCaseInput.charAt(i))) {
                if (count.containsKey(lowerCaseInput.charAt(i))) {
                    count.replace(lowerCaseInput.charAt(i), count.get(lowerCaseInput.charAt(i)) + 1);
                } else {
                    count.put(lowerCaseInput.charAt(i), 1);
                }
            }
        }

        for(Map.Entry<Character, Integer> value : count.entrySet()){
            System.out.println(value.getKey() + ": " + value.getValue());
        }
    }
}
