package com.taras.figures;

import static java.lang.System.*;

public class Aplication {
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        out.println("The square of square: " + square.getSquare(3.5));
        out.println("The perimeter of square: " + square.getPerimeter(3.5));
        out.println("The square of rectangle " + rectangle.getSquare(1.2, 2.5));
        out.println("The perimeter of rectangle: " + rectangle.getPerimeter(1.2, 2.5));
        out.println("The square of circle: " +circle.getSquare(2));
        out.println("The length of the circle: " + circle.getPerimeter(2));
    }
}
