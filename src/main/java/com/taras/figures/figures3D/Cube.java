package com.taras.figures.figures3D;

import com.taras.figures.figures2D.Square;

import java.text.DecimalFormat;

public class Cube extends Square implements Figures3D {
    private double width;

    //constructor
    public Cube(double width) {
        super(width);
        this.width = width;
    }

    // calculate cubes capacity
    public double getCapacity() {
        return Math.pow(width, 3);
    }

    /* Figures name */
    public String name() {
        return "cube";
    }

    @Override
    public String writeResultFigure() {
        return this.name() + " " + new DecimalFormat("#0.00").format(width)
                + " capacity=" + new DecimalFormat("#0.00").format(this.getCapacity()) + "\n";
    }
}
