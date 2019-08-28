package com.taras.figures3D;

import com.taras.figures2D.Square;
import com.taras.figures3D.Figures3D;

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
    public void name() {
        System.out.println("The Сube");
    }
}
