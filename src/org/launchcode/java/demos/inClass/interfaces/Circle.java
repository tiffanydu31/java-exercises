package org.launchcode.java.demos.inClass.interfaces;

/**
 * Created by lucke on 6/15/2017.
 */
public class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI *  Math.pow(radius, 2);
    }
}
