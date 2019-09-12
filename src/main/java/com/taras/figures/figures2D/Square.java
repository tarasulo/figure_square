package com.taras.figures.figures2D;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DecimalFormat;

import static java.lang.System.out;

public class Square implements Figures2D {
    private double width;

    /* constructor */
    public Square(double width) {
        this.width = width;
    }
    /* calculate squares square */
    public double getSquare() {
        return Math.pow(width, 2);
    }
    /* calculate squares perimeter */
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public String name() {
        return "square";
    }

    @Override
    public String writeResultFigure2D() {
        return this.name() + " " + new DecimalFormat("#0.00").format(width) + " square="
                + new DecimalFormat("#0.00").format(this.getSquare()) + " perimeter="
                + new DecimalFormat("#0.00").format(this.getPerimeter()) + System.lineSeparator();
    }
}
