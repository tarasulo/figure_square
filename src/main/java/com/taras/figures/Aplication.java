package com.taras.figures;

import com.taras.figures.figures2D.Circle;
import com.taras.figures.figures2D.Figures2D;
import com.taras.figures.figures2D.Rectangle;
import com.taras.figures.figures2D.Square;
import com.taras.figures.figures3D.Ball;
import com.taras.figures.figures3D.Cube;
import com.taras.figures.figures3D.Figures3D;
import com.taras.figures.figures3D.Parallelepiped;

import static java.lang.System.*;

public class Aplication {
    public static void main(String[] args) {
        Figures2D square = new Square(Math.random());
        Figures2D rectangle = new Rectangle(Math.random(), Math.random());
        Figures2D circle = new Circle(Math.random());
        Figures2D[] figures2D = new Figures2D[] {
                square,
                rectangle,
                circle };
        for (int i = 0; i< figures2D.length; i++) {
            figures2D[i].name();
            out.println("The square of figure: " + figures2D[i].getSquare());
            out.println("The perimeter of figure: " + figures2D[i].getPerimeter());
        }

        Figures3D cube = new Cube(Math.random());
        Figures3D ball = new Ball(Math.random());
        Figures3D parallelepiped = new Parallelepiped(Math.random(), Math.random(), Math.random());
        Figures3D[] figures3D = new Figures3D[] {
                cube,
                ball,
                parallelepiped };

        for (int i = 0; i< figures2D.length; i++) {
            figures3D[i].name();
            out.println("The capacity of figure: " + figures3D[i].getCapacity());
        }
    }
}
