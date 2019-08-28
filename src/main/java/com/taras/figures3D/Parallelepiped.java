package com.taras.figures3D;

import com.taras.figures2D.Rectangle;
import com.taras.figures3D.Figures3D;

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
