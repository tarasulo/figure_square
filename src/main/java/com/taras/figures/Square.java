package com.taras.figures;

public class Square implements Figures {
    public double width;

   public double getSquare() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getSquare(double width) {
        return width * width;
    }

    public double getPerimeter(double width) {
        return width * 4;
    }

}
