package com.taras.figures;

import com.taras.figures2D.Circle;
import com.taras.figures2D.Figures2D;
import com.taras.figures2D.Rectangle;
import com.taras.figures2D.Square;
import com.taras.figures3D.Ball;
import com.taras.figures3D.Cube;
import com.taras.figures3D.Figures3D;
import com.taras.figures3D.Parallelepiped;

import static java.lang.System.*;

public class Aplication {
    public static void main(String[] args) {
        Figures2D square = new Square(5.0);
        Figures2D rectangle = new Rectangle(2.2, 4.1);
        Figures2D circle = new Circle(3.0);
        Figures3D cube = new Cube(4.0);
        Figures3D ball = new Ball(2.0);
        Figures3D parallelepiped = new Parallelepiped(2.0, 1.5, 3);
        Figures2D ball2 = new Ball(2.0);
        Figures2D cube2 = new Cube(5.0);
        Figures2D parallelepiped2 = new Parallelepiped(5.0, 1.0, 3);
        out.println("The square of square: " + square.getSquare());
        out.println("The perimeter of square: " + square.getPerimeter());
        out.println("The square of rectangle " + rectangle.getSquare());
        out.println("The perimeter of rectangle: " + rectangle.getPerimeter());
        out.println("The square of circle: " +circle.getSquare());
        out.println("The length of the circle: " + circle.getPerimeter());
        out.println("The capacity of the cube: " + cube.getCapacity());
        out.println("The capacity of the ball: " + ball.getCapacity());
        out.println("The capacity of the parallelepiped: " + parallelepiped.getCapacity());
        out.println("The length of the ball: " + ball2.getPerimeter());
        out.println("The square of cube: " +cube2.getSquare());
        out.println("The square of parallelepiped: " +parallelepiped2.getSquare());
    }
}
