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
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

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

    private static void writeFiguresToFile(Path path1, Path path2) {
        try{
            List contents = Files.readAllLines(path1);
            //Read from the stream
            for(Object content:contents){//for each line of content in contents
                String line = content.toString();
                String[] stringArray = line.split(" ");
                String result = "";
                if (stringArray[0].equals("rectangle")) {
                    result += stringArray[0] + " " + stringArray[1] + " "
                            + stringArray[2] + System.lineSeparator();
                } else if (stringArray[0].equals("parallelepiped")) {
                    result += stringArray[0] + " " + stringArray[1] + " "
                            + stringArray[2] + " " + stringArray[3]
                            + System.lineSeparator();
                } else {
                    result += stringArray[0] + " " + stringArray[1]
                            + System.lineSeparator();
                }
                writeToFile(path2, result);
            }
        }catch (IOException ex){
            out.println("File doesn't answered " + ex);
        }
    }

    private static void figureFactory(Figures figure, Path path, int marker) {
        if (marker == 2) {
            switch (randomForSwitch()) {
                case 1:
                    figure = new Square(randomParam());
                    break;
                case 2:
                    figure = new Rectangle(randomParam(), randomParam());
                    break;
                case 3:
                    figure = new Circle(randomParam());
                    break;
                default:
                    break;
            }
        }
        if (marker == 3){
            switch (randomForSwitch()) {
                case 1:
                    figure = new Cube(randomParam());
                    break;
                case 2:
                    figure = new Parallelepiped(randomParam(), randomParam(), randomParam());
                    break;
                case 3:
                    figure = new Ball(randomParam());
                    break;
                default:
                    break;
            }
        }
        String data = figure.writeResultFigure();
        writeToFile(path, data);
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            out.println("Please, write arguments: " +
                    "1) file name with url for results of 2D figures " +
                    "2) file name with url for results of 3D figures" +
                    "3) default array capacity " +
                    "4) file name with url for figures args");
            return;
        }

        int defaultCapacity = Integer.parseInt(args[2]);
        Path path2D = Paths.get(args[0]);
        Path path3D = Paths.get(args[1]);
        Path pathArgs = Paths.get(args[3]);


        try {
            Files.createFile(path2D);
            Files.createFile(path3D);
            Files.createFile(pathArgs);
        } catch (IOException e) {
            out.println("File already created " + e);
        }

        Figures2D[] figures2D = new Figures2D[defaultCapacity];
        for (int i = 0; i < figures2D.length; i++) {
            figureFactory(figures2D[i], path2D, 2);
        }

        Figures3D[] figures3D = new Figures3D[defaultCapacity];
        for (int i = 0; i < figures3D.length; i++) {
            figureFactory(figures3D[i], path3D, 3);
        }

        writeFiguresToFile(path2D, pathArgs);
        writeFiguresToFile(path3D, pathArgs);
    }
}
