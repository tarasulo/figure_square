package com.taras.figures;

public class Rectangle implements Figures{
    public double width;
    public double height;

   public double getSquare() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getSquare(double radius) {
        return 0;
    }

    @Override
    public double getPerimeter(double radius) {
        return 0;
    }

    public double getSquare(double width, double height) {
        return width * height;
    }

    public double getPerimeter(double width, double height) {
        return (width + height) * 2;
    }
}
