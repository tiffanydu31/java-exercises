package org.launchcode.java.demos.inClass;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by lucke on 5/11/2017.
 */
public class AddArrayListValues {
    public static void main(String [] args) {
        Integer[] values1 = new Integer[]{3, 4, 5, 1};
        ArrayList<Integer> ls1 = new ArrayList<Integer>(Arrays.asList(values1));

        Integer[] values2 = new Integer[]{3, 10};
        ArrayList<Integer> ls2 = new ArrayList<Integer>(Arrays.asList(values2));

        System.out.println(ls1 + " + " + ls2);
        System.out.println(add(ls1, ls2));

    }

    public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> ls = new ArrayList<>();

        ArrayList<Integer> bigger = a;
        ArrayList<Integer> smaller = b;
        if (a.size() < b.size()) {
            bigger = b;
            smaller = a;
        }

        for (int i=0; i < bigger.size(); i++){
            if (i < smaller.size()){
                ls.add(bigger.get(i)+smaller.get(i));
            } else {
                ls.add(bigger.get(i));
            }
        }
        return ls;
    }
}
