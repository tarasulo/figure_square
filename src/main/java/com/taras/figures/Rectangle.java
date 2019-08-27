package com.taras.figures;

public class Rectangle implements Figures{
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getSquare() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }
}
