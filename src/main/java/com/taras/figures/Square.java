package com.taras.figures;

public class Square implements Figures {
    public double width;

    public Square(double width) {
        this.width = width;
    }

    public double getSquare() {
        return width * width;
    }

    public double getPerimeter() {
        return width * 4;
    }

}
