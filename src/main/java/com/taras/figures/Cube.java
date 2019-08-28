package com.taras.figures;

public class Cube implements Figures3D {
    private double width;
    //constructor
    public Cube(double width) {
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
