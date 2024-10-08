package edu.ithaca.dragon.shapes;

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
        for (int i=0; i< shapes.size(); i++) { 
            System.out.println("" + (i+1) + "\n" + shapes.get(i) + "\n");
        }
        System.out.println("Doubling the size of all shapes...");
        for (Shape shape : shapes) {
            shape.doubleSize();
        }
        while (true) {
            for (int i=0; i< shapes.size(); i++) { 
                System.out.println("" + (i+1) + "\n" + shapes.get(i) + "\n");
            }
            System.out.print("Select a shape (type \"exit\" to exit): ");;
            String text_input = scanner.nextLine(); 
            int input = 0;
            if (text_input.toLowerCase().equals("exit")){
                break;
            }
            try {
                input = Integer.parseInt(text_input);
            }
            catch (NumberFormatException e) {
                System.out.println("Please input a valid number.");
                continue;
            }
            
            if (input -1 >= shapes.size() || input < 0) {
                System.out.print("Please input a valid rectangle.");
            }
            else {
                Shape theShape = shapes.get(input-1);
                theShape.doubleSize();
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
            shapes.add(generateRandomShape(1,100));
        }
        return shapes;
    }

    public static Shape generateRandomShape(int minLength, int maxLength) {
        int num = randInt(1, 3);
        switch (num) {
            case 1: {
                return new Circle((double)randInt(minLength, maxLength));
            }
            case 2: {
                return new Rectangle((double)randInt(minLength, maxLength), (double) randInt(minLength, maxLength));
            }
            case 3: {
                int firstSide = randInt(minLength, maxLength); int secondSide = randInt(minLength, maxLength);
                int thirdSide = randInt(Math.abs(firstSide - secondSide) +1, firstSide + secondSide -1);
                return new Triangle(firstSide, secondSide, thirdSide);
            }
        }
        return null;
    }

} 
