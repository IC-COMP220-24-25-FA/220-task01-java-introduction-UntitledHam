package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width; 
    

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return width * length; 
    }

    public void doubleSize(){
        width *= (double) Math.sqrt(2);
        length *= (double) Math.sqrt(2);
    }

    public double longestLineWithin(){
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public String toString() {
        return "Length: " + length + "\nWidth: " + width + "\nArea: " + calcArea() + "\nLongest Line within: " + longestLineWithin(); 
    }
    
}
