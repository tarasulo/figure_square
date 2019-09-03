package com.taras.figures.figures3D;

import com.taras.figures.figures2D.Rectangle;

import java.text.DecimalFormat;

public class Parallelepiped extends Rectangle implements Figures3D {
    private double width;
    private double height;
    private double length;
    //constructor
    public Parallelepiped(double width, double height, double length) {
        super(width, height);
        this.width = width;
        this.height = height;
        this.length = length;
    }

    /* calculate parallelepiped's capacity */
    public double getCapacity() {
        return width*height*length;
    }

    /* Figures name */
    public String name() {
        return "parallelepiped";
    }

    @Override
    public String writeResultFigure3D() {
        return this.name() + " " + new DecimalFormat("#0.00").format(width)
                + " " + new DecimalFormat("#0.00").format(height) + " "
                + new DecimalFormat("#0.00").format(length) + " capacity="
                + new DecimalFormat("#0.00").format(this.getCapacity()) + "\n";
    }
}
