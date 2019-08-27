package com.taras.figures;

public class Square implements Figures {
    public double width = 5.0;

   public double getSquare() {
        return width * width;
    }

    public double getPerimeter() {
        return width * 4;
    }

}
