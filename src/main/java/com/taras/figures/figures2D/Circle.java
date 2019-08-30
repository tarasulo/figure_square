package com.taras.figures.figures2D;

public class Circle implements Figures2D {
    private double radius;
    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    //calculate circles square
    public double getSquare() {
        return Math.PI * radius * radius;
    }
    //calculate circles perimeter
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String name() {
        return "The Circle";
    }
}
