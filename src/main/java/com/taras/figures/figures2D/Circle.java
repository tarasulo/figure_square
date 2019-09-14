package com.taras.figures.figures2D;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;

import static java.lang.System.out;

public class Circle implements Figures2D {
    private double radius;
    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    //calculate circles square
    public double getSquare() {
        return Math.PI * radius * radius;
    }
    //calculate circles perimeter
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String name() {
        return "circle";
    }

    @Override
    public String writeResultFigure() {
        return this.name() + " " + new DecimalFormat("#0.00").format(radius) + " square="
                + new DecimalFormat("#0.00").format(this.getSquare()) + " perimeter="
                + new DecimalFormat("#0.00").format(this.getPerimeter())
                + System.lineSeparator();
    }
}
