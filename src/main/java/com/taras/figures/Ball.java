package com.taras.figures;

public class Ball implements Figures3D {
    private double radius;
    //constructor
    public Ball(double radius) {
        this.radius = radius;
    }

    /* calculate ball's capacity */
    public double getCapacity() {
        return 4*Math.PI*Math.pow(radius, 3)/3;
    }

    /* Figures name */
    public void name() {
        System.out.println("The BaLL");
    }
}