package org.launchcode.java.demos.inClass.interfaces;

import java.util.ArrayList;

/**
 * Created by lucke on 6/15/2017.
 */
public class main {
    public static void main(String[] args) {
        Circle c = new Circle(5.2);
        Rectangle r = new Rectangle(4.7, 8.1);

        ArrayList<Measurable> measurables = new ArrayList<>();
        measurables.add(c);
        measurables.add(r);

        for(Measurable item : measurables) {
            System.out.println(item.getClass());
            System.out.println(item.getArea());
            System.out.println(item.getPerimeter());
        }
    }
}
