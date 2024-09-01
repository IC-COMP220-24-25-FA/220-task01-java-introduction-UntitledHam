package edu.ithaca.dragon.shapes;
import java.util.Arrays;

public class Triangle {
    private double[] sides; 
    public Triangle(double side0, double side1, double side2){
        sides = new double[] {side0, side1, side2}; 
    }

    public double calcArea() {
        double halfPerimeter = (sides[0] + sides[1] + sides[2])/2; 
        return Math.sqrt(halfPerimeter * (halfPerimeter - sides[0]) * (halfPerimeter - sides[1]) * (halfPerimeter - sides[2]));
    }

    public void doubleSize() {
        for (int i=0; i< sides.length; i++) {
            sides[i] *= Math.sqrt(2);
        }
    }

    public double longestLineWithin() {
        double[] sidesCopy = sides.clone();
        Arrays.sort(sidesCopy); 
        return sidesCopy[2]; 
    }

    public double calcHeight() {
        return 2 * (calcArea()/sides[0]); 
    }

    public double[] getSides() {
        return sides; 
    }
}
