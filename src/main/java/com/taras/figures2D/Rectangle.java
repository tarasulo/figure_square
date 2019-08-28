package com.taras.figures2D;

public class Rectangle implements Figures2D {
    private double width;
    private double height;

    //constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /* calculate rectangles square */
    public double getSquare() {
        return width * height;
    }
    /* calculate rectangles perimeter */
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public void name() {
        System.out.println("The Rectangle");
    }
}
