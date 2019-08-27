package com.taras.figures;

public class Circle implements Figures {
    public double radius;
    final double pi = 3.14159265359;

    public double getSquare() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getSquare(double radius) {
        return pi * radius * radius;
    }

    public double getPerimeter(double radius) {
        return pi * 2 * radius;
    }

}
