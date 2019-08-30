package com.taras.figures.figures3D;

import com.taras.figures.figures2D.Square;

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
        return "The Сube";
    }
}
