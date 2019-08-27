package com.taras.figures;

import static java.lang.System.*;

public class Aplication {
    public static void main(String[] args) {
        Figures square = new Square();
        Figures rectangle = new Rectangle();
        Figures circle = new Circle();
        out.println("The square of square: " + square.getSquare());
        out.println("The perimeter of square: " + square.getPerimeter());
        out.println("The square of rectangle " + rectangle.getSquare());
        out.println("The perimeter of rectangle: " + rectangle.getPerimeter());
        out.println("The square of circle: " +circle.getSquare());
        out.println("The length of the circle: " + circle.getPerimeter());
    }
}
