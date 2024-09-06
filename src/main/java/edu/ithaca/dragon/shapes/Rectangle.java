package edu.ithaca.dragon.shapes;

public class Rectangle implements Shape{
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

    @Override
    public String toString() {
        return "Rectangle:\nSides: ("+length+", "+width+")"+"\nLongest line within: " + longestLineWithin() + "\nArea: " + calcArea(); 
    }
    
}
