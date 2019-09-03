package com.taras.figures.figures2D;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.System.out;

public class Rectangle implements Figures2D {
    private double width;
    private double height;

    //constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /* calculate rectangles square */
    public double getSquare() {
        return width * height;
    }
    /* calculate rectangles perimeter */
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String name() {
        return "rectangle";
    }

    @Override
    public String writeResultFigure2D() {
        return this.name() + " " + width + " " + height + " square=" + this.getSquare()
                + " perimeter=" + this.getPerimeter() + "\n";
    }

    public void writeToFile(String data, Path path) {
        try {
            Path result = Files.createFile(path);
            Files.write(path, data.getBytes());
        } catch (IOException e) {
            e.toString();
            out.println("File already created " + e);
        }
    }
}
