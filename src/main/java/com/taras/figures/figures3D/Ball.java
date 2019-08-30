package com.taras.figures.figures3D;

import com.taras.figures.figures2D.Circle;

public class Ball extends Circle implements Figures3D {
    private double radius;
    //constructor
    public Ball(double radius) {
        super(radius);
        this.radius = radius;
    }

    /* calculate ball's capacity */
    public double getCapacity() {
        return 4*Math.PI*Math.pow(radius, 3)/3;
    }

    /* Figures name */
    public String name() {
        return "The BaLL";
    }
}
