package com.taras.figures2D;

public class Square implements Figures2D {
    public double width;

    /* constructor */
    public Square(double width) {
        this.width = width;
    }
    /* calculate squares square */
    public double getSquare() {
        return Math.pow(width, 2);
    }
    /* calculate squares perimeter */
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public void name() {
        System.out.println("The Square");
    }
}
