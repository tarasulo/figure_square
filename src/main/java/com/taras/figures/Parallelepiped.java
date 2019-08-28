package com.taras.figures;

public class Parallelepiped implements Figures3D {
    private double width;
    private double height;
    private double length;
    //constructor
    public Parallelepiped(double width, double height, double length) {
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
