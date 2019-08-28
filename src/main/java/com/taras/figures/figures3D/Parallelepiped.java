package com.taras.figures.figures3D;

import com.taras.figures.figures2D.Rectangle;

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
    public void name() {
        System.out.println("The Parallelepiped");
    }
}
