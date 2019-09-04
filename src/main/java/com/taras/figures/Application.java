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

    private static double randomParam() {
        return random() * 100 + 1;
    }

    private static void writeToFile(Path path, String result) {
        try {
            Files.write(path, result.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            out.println("File doesn't answered " + e);
        }
    }

    private static int randomForSwitch() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(3) + 1;
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            out.println("Please, write arguments: " +
                    "1) file name with url for results of 2D figures " +
                    "2) file name with url for results of 3D figures" +
                    "3) default array capacity ");
            return;
        }

        int defaultCapacity = Integer.parseInt(args[2]);
        Path path2D = Paths.get(args[0]);
        Path path3D = Paths.get(args[1]);


        try {
            Files.createFile(path2D);
            Files.createFile(path3D);
        } catch (IOException e) {
            out.println("File already created " + e);
        }

        Figures2D[] figures2D = new Figures2D[defaultCapacity];
        for (int i = 0; i < figures2D.length; i++) {
            switch (randomForSwitch()) {
                case 1:
                    figures2D[i] = new Square(randomParam());
                    break;
                case 2:
                    figures2D[i] = new Rectangle(randomParam(), randomParam());
                    break;
                case 3:
                    figures2D[i] = new Circle(randomParam());
                    break;
                default:
                    break;
            }
            String data = figures2D[i].writeResultFigure2D();
            writeToFile(path2D, data);
        }

        Figures3D[] figures3D = new Figures3D[defaultCapacity];
        for (int i = 0; i < figures3D.length; i++) {
            switch (randomForSwitch()) {
                case 1:
                    figures3D[i] = new Cube(randomParam());
                    break;
                case 2:
                    figures3D[i] = new Parallelepiped(randomParam(), randomParam(), randomParam());
                    break;
                case 3:
                    figures3D[i] = new Ball(randomParam());
                    break;
                default:
                    break;
            }
            String data = figures3D[i].writeResultFigure3D();
            writeToFile(path3D, data);
        }
    }
}
