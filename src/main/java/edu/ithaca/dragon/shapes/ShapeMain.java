package edu.ithaca.dragon.shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

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
    public static Rectangle[] generateRectangles(int num) {
        Rectangle[] rectangles = new Rectangle[num]; 
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle((double) randInt(1, 50), (double) randInt(1, 50));
        }

        return rectangles; 
    }
} 
