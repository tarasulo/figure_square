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
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Application {

    public static void main(String[] args) throws IOException {
        String url1 = args[0];
        String url2 = args[1];
        int defaultCapacity = Integer.parseInt(args[2]);
        Path path2D = Paths.get(url1);
        Path path3D = Paths.get(url2);
        try {
            Path result1 = Files.createFile(path2D);
            Path result2 = Files.createFile(path3D);
        } catch (IOException e) {
            e.toString();
            out.println("File already created " + e);
        }

        Figures2D[] figures2D = new Figures2D[defaultCapacity];
        for (int i = 0; i < figures2D.length; i++) {
            Random randomGenerator = new Random();
            int rand = randomGenerator.nextInt(3) + 1;
            switch (rand) {
                case 1:
                    figures2D[i] = new Square((random() * 100) + 1);
                    break;
                case 2:
                    figures2D[i] = new Rectangle((random() * 100) + 1, (random() * 100) + 1);
                    break;
                case 3:
                    figures2D[i] = new Circle((random() * 100) + 1);
                    break;
                default:
                    break;
            }
            String data = figures2D[i].writeResultFigure2D();
            try {
                Files.write(path2D, data.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.toString();
                out.println("File doesn't answered " + e);
            }

        }

        Figures3D[] figures3D = new Figures3D[defaultCapacity];
        for (int i = 0; i < figures3D.length; i++) {
            double width = (random() * 100) + 1;
            double height = (random() * 100) + 1;
            double length = (random() * 100) + 1;
            Random randomGenerator = new Random();
            int rand = randomGenerator.nextInt(3) + 1;
            switch (rand) {
                case 1:
                    figures3D[i] = new Cube(width);
                    break;
                case 2:
                    figures3D[i] = new Parallelepiped(width, height, length);
                    break;
                case 3:
                    figures3D[i] = new Ball(width);
                    break;
                default:
                    break;
            }
            String data = figures3D[i].writeResultFigure3D();
            try {
                Files.write(path3D, data.toString().getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.toString();
                out.println("File doesn't answered " + e);
            }
        }

    }
}
