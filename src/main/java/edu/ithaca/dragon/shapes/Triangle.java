package edu.ithaca.dragon.shapes;
import java.util.Arrays;

public class Triangle {
    private double[] sides; 
    public Triangle(double[] sidesIn){
        sides = sidesIn; 
    }

    public double calcArea() {
        double halfPerimeter = (sides[0] + sides[1] + sides[2])/2; 
        return Math.sqrt(halfPerimeter * (halfPerimeter - sides[0]) * (halfPerimeter - sides[1]) * (halfPerimeter - sides[2]));
    }

    public void doubleSize() {
        sides[0] *= Math.pow(2,(1/3)); 
        sides[1] *= Math.pow(2,(1/3));
        sides[2] *= Math.pow(2,(1/3));
    }

    public double longestLineWithin() {
        double[] sides_copy = sides.clone();
        Arrays.sort(sides_copy); 
        return sides_copy[2]; 
    }
}
