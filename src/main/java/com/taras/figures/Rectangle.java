package com.taras.figures;

public class Rectangle implements Figures{
    public double width = 2.0;
    public double height = 3.2;

   public double getSquare() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }
}
