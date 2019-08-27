package com.taras.figures;

public class Circle implements Figures {
    public double radius = 4.5;
    final double pi = 3.14159265359;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return pi * 2 * radius;
    }

}
