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

public class Application {

    public static void main(String[] args) throws IOException {
        int defaultCapacity = 100;
        String url1 = "C:\\Java\\project\\figure_square\\src\\main\\java\\result2D.txt";
        String url2 = "C:\\Java\\project\\figure_square\\src\\main\\java\\result3D.txt";
        StringBuilder content2D = new StringBuilder("2D Figures \n");
        StringBuilder content3D = new StringBuilder("3D Figures \n");

        Figures2D[] figures2D = new Figures2D[defaultCapacity];
        for (int i = 0; i < figures2D.length; i++) {
            Random randomGenerator = new Random();
            int rand = randomGenerator.nextInt(3) + 1;
            switch (rand) {
                case 1:
                    Figures2D square = new Square((random() * 100) + 1);
                    figures2D[i] = square;
                    break;
                case 2:
                    Figures2D rectangle = new Rectangle((random() * 100) + 1, (random() * 100) + 1);
                    figures2D[i] = rectangle;
                    break;
                case 3:
                    Figures2D circle = new Circle((random() * 100) + 1);
                    figures2D[i] = circle;
                    break;
                default:
                    break;
            }
        }

        Figures3D[] figures3D = new Figures3D[defaultCapacity];
        for (int i = 0; i < figures3D.length; i++) {
            Random randomGenerator = new Random();
            int rand = randomGenerator.nextInt(3) + 1;
            switch (rand) {
                case 1:
                    Figures3D cube = new Cube((random() * 100) + 1);
                    figures3D[i] = cube;
                    break;
                case 2:
                    Figures3D parallelepiped = new Parallelepiped((random() * 100) + 1,
                            (random() * 100) + 1, (random() * 100) + 1);
                    figures3D[i] = parallelepiped;
                    break;
                case 3:
                    Figures3D ball = new Ball((random() * 100) + 1);
                    figures3D[i] = ball;
                    break;
                default:
                    break;
            }
        }

        for (Figures2D figure : figures2D) {
            content2D.append(figure.name())
                    .append(" \n")
                    .append("The square of figure: ")
                    .append(figure.getSquare())
                    .append(" \n")
                    .append("The perimeter of figure: ")
                    .append(figure.getPerimeter())
                    .append(" \n");
        }

        for (Figures3D figure : figures3D) {
            content3D.append(figure.name())
                    .append(" \n")
                    .append("The capacity of figure: ")
                    .append(figure.getCapacity())
                    .append(" \n");
        }

        Path path2D = Paths.get(url1);
        try {
            Path result = Files.createFile(path2D);
            Files.write(path2D, content2D.toString().getBytes());
        } catch (IOException e) {
            e.toString();
            out.println("File already created " + e);
        }

        Path path3D = Paths.get(url2);
        try {
            Path result = Files.createFile(path3D);
            Files.write(path3D, content3D.toString().getBytes());
        } catch (IOException e) {
            e.toString();
            out.println("File already created " + e);
        }

    }
}
