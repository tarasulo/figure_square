package com.taras.figures.figures2D;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;

import static java.lang.System.out;

public class Rectangle implements Figures2D {
    private double width;
    private double height;

    //constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /* calculate rectangles square */
    public double getSquare() {
        return width * height;
    }
    /* calculate rectangles perimeter */
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String name() {
        return "rectangle";
    }

    @Override
    public String writeResultFigure2D() {
        return this.name() + " " + new DecimalFormat("#0.00").format(width)
                + " " + new DecimalFormat("#0.00").format(height) + " square="
                + new DecimalFormat("#0.00").format(this.getSquare())
                + " perimeter=" + new DecimalFormat("#0.00").format(this.getPerimeter())
                + System.lineSeparator();
    }
}
