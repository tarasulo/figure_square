package com.taras.figures;

import com.taras.figures.figures2D.Circle;
import com.taras.figures.figures2D.Figures2D;
import com.taras.figures.figures2D.Rectangle;
import com.taras.figures.figures2D.Square;
import com.taras.figures.figures3D.Ball;
import com.taras.figures.figures3D.Cube;
import com.taras.figures.figures3D.Figures3D;
import com.taras.figures.figures3D.Parallelepiped;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Aplication {

    private static int defaultCapacity = 100;
    private static String content = "2D Figures \n";
    public static void main(String[] args) throws IOException {

        Figures2D[] figures2D = new Figures2D[defaultCapacity];
        for (Figures2D figure : figures2D) {
            Random randomGenerator = new Random();
            int rand = randomGenerator.nextInt(3) + 1;
            switch (rand) {
                case 1: Figures2D square = new Square((random() * 100) + 1);
                    figure = square;
                    break;
                case 2: Figures2D rectangle = new Rectangle((random() * 100) + 1, (random() * 100) + 1);
                    figure = rectangle;
                    break;
                case 3: Figures2D circle = new Circle((random() * 100) + 1);
                    figure = circle;
                    break;
                default: break;
            }
            content += figure.name() + " \n"
                    + "The square of figure: " + figure.getSquare() + " \n"
                    + "The perimeter of figure: " + figure.getPerimeter() + " \n";
        }

        Path path = Paths.get("C:\\Java\\project\\figure_square\\src\\main\\java\\result.txt");
        try {
            Path result = Files.createFile(path);
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            e.toString();
            out.println("File already created " + e);
        }


        Figures3D cube = new Cube(random());
        Figures3D ball = new Ball(random());
        Figures3D parallelepiped = new Parallelepiped(random(), random(), random());
        Figures3D[] figures3D = new Figures3D[] {
                cube,
                ball,
                parallelepiped };

        for (int i = 0; i< figures3D.length; i++) {
            figures3D[i].name();
            out.println("The capacity of figure: " + figures3D[i].getCapacity());
        }
    }
}
