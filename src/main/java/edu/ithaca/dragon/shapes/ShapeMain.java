package edu.ithaca.dragon.shapes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        Rectangle[] rectangles = generateRectangles(5); 
        Scanner scanner = new Scanner(System.in);
        for (int x=0; x < 5; x++) {
            for (int i=0; i< rectangles.length; i++) { 
                System.out.println("Rectangle: " + (i+1) + "\n" + rectangles[i] + "\n");
            }
            System.out.print("Select a rectangle (type \"-1\" to exit): ");;
            int input = scanner.nextInt(); 
            if (input == -1) {
                break; 
            }
            else if (input >= rectangles.length || input < 0) {
                System.out.print("Please input a valid rectangle.");
            }
            else {
                rectangles[input].doubleSize();
                System.out.println("Doubled Rectangle: " + input +"'s size.\n");
            }

        }
        scanner.close();
        
    }

    public static int randInt(int min, int max) {
        return (int)(Math.random() * (max - min +1)) + min; 
    }

    public static List<Shape> generateShapes(int numShapes) {
        List<Shape> shapes = new ArrayList<>();
        for (int i=0; i < numShapes; i++) {
            shapes.add(generateRandomShape());
        }
        return shapes;
    }

    public static Shape generateRandomShape() {
        int num = randInt(1, 3);
        switch (num) {
            case 1: {
                return new Circle((double)randInt(1, 100));
            }
            case 2: {
                return new Rectangle((double)randInt(1, 100), (double) randInt(1, 100));
            }
            case 3: {
                int firstSide = randInt(1, 100); int secondSide = randInt(1, 100);
                int thirdSide = randInt(1, firstSide + secondSide -1);
                return new Triangle((double)firstSide, (double) secondSide, (double) thirdSide);
            }
        }
        return null;
    }
} 
