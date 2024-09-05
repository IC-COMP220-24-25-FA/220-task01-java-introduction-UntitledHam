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
        List<Shape> shapes = generateShapes(10); 
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (int i=0; i< shapes.size(); i++) { 
                System.out.println("" + (i+1) + "\n" + shapes.get(i) + "\n");
            }
            System.out.print("Select a shape (type \"-1\" to exit): ");;
            int input = scanner.nextInt(); 
            if (input == -1) {
                break; 
            }
            else if (input >= shapes.size() || input < 0) {
                System.out.print("Please input a valid rectangle.");
            }
            else {
                shapes.get(input-1).doubleSize();
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
        int num = 3;
        switch (num) {
            case 1: {
                return new Circle((double)randInt(1, 100));
            }
            case 2: {
                return new Rectangle((double)randInt(1, 100), (double) randInt(1, 100));
            }
            case 3: {
                int firstSide = randInt(1, 100); int secondSide = randInt(1, firstSide -1);
                int thirdSide = randInt(1 , secondSide -1);
                System.out.println("Test: " + firstSide + ", " + secondSide + ", " + thirdSide);
                return new Triangle((double)firstSide, (double) secondSide, (double) thirdSide);
            }
        }
        return null;
    }

} 
