package com.taras.figures;

import static java.lang.System.*;

public class Aplication {
    public static void main(String[] args) {
        Figures square = new Square(5.0);
        Figures rectangle = new Rectangle(2.2, 4.1);
        Figures circle = new Circle(3.0);

        out.println("The square of square: " + square.getSquare());
        out.println("The perimeter of square: " + square.getPerimeter());
        out.println("The square of rectangle " + rectangle.getSquare());
        out.println("The perimeter of rectangle: " + rectangle.getPerimeter());
        out.println("The square of circle: " +circle.getSquare());
        out.println("The length of the circle: " + circle.getPerimeter());
    }
}
