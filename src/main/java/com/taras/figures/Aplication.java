package com.taras.figures;

import static java.lang.System.*;

public class Aplication {
    public static void main(String[] args) {
        Figures2D square = new Square(5.0);
        Figures2D rectangle = new Rectangle(2.2, 4.1);
        Figures2D circle = new Circle(3.0);
        Figures3D cube = new Cube(4.0);
        Figures3D ball = new Ball(2.0);
        Figures3D parallelepiped = new Parallelepiped(2.0, 1.5, 3);
        out.println("The square of square: " + square.getSquare());
        out.println("The perimeter of square: " + square.getPerimeter());
        out.println("The square of rectangle " + rectangle.getSquare());
        out.println("The perimeter of rectangle: " + rectangle.getPerimeter());
        out.println("The square of circle: " +circle.getSquare());
        out.println("The length of the circle: " + circle.getPerimeter());
        out.println("The capacity of the cube: " + cube.getCapacity());
        out.println("The capacity of the ball: " + ball.getCapacity());
        out.println("The capacity of the parallelepiped: " + parallelepiped.getCapacity());
    }
}
