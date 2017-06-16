package org.launchcode.java.demos.inClass.interfaces;


import org.launchcode.java.demos.inClass.interfaces.Measurable;

/**
 * Created by lucke on 6/15/2017.
 */
public class Rectangle implements Measurable {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
