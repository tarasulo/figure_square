package com.taras.figures.figures2D;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.lang.System.out;

public class Circle implements Figures2D {
    private double radius;
    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    //calculate circles square
    public double getSquare() {
        return Math.PI * radius * radius;
    }
    //calculate circles perimeter
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String name() {
        return "circle";
    }

    @Override
    public String writeResultFigure2D() {
        return this.name() + " " + radius + " square=" + this.getSquare()
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
