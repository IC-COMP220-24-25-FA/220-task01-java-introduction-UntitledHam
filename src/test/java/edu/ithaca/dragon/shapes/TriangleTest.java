package edu.ithaca.dragon.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.management.RuntimeErrorException;

public class TriangleTest {
    @Test
    public void testCalcArea() {
        Triangle myTriangle = new Triangle(1,1,1); 
        assertEquals(myTriangle.calcArea(), 0.433, 0.005);

        myTriangle = new Triangle(5,6,7); 
        assertEquals(myTriangle.calcArea(), 14.697, 0.005);

        myTriangle = new Triangle(10,10,15); 
        assertEquals(myTriangle.calcArea(), 49.61, 0.005);
    }
    @Test
    public void testCalcHeight() { 
        Triangle myTriangle = new Triangle(1,1,1); 
        assertEquals(0.5 * myTriangle.calcHeight() * myTriangle.getSides()[0], myTriangle.calcArea(), 0.005);
        myTriangle = new Triangle(5,6,7); 
        assertEquals(0.5 * myTriangle.calcHeight() * myTriangle.getSides()[0], myTriangle.calcArea(), 0.005);
        myTriangle = new Triangle(10,10,15); 
        assertEquals(0.5 * myTriangle.calcHeight() * myTriangle.getSides()[0], myTriangle.calcArea(), 0.005);
    }
    @Test 
    public void testDoubleSize() {
        Triangle refTriangle = new Triangle(1,1,1); 
        Triangle doubleTriangle = new Triangle(1,1,1); 
        doubleTriangle.doubleSize();
        assertEquals(refTriangle.calcArea() * 2, doubleTriangle.calcArea(), 0.005);

        refTriangle = new Triangle(5,6,7); 
        doubleTriangle = new Triangle(5,6,7); 
        doubleTriangle.doubleSize();
        assertEquals(refTriangle.calcArea() * 2, doubleTriangle.calcArea(), 0.005);

        refTriangle = new Triangle(10,10,15); 
        doubleTriangle = new Triangle(10,10,15); 
        doubleTriangle.doubleSize();
        assertEquals(refTriangle.calcArea() * 2, doubleTriangle.calcArea(), 0.005);
        
    }
    @Test
    public void TestLongestLineWithin() {
        Triangle myTriangle = new Triangle(3,4,5); 
        for (double side : myTriangle.getSides()) { 
            assertTrue(myTriangle.longestLineWithin() >= side);

        }

        myTriangle = new Triangle(1,1,1); 
        for (double side : myTriangle.getSides()) { 
            assertTrue(myTriangle.longestLineWithin() >= side);
        }
        myTriangle = new Triangle(10,10,15); 
        for (double side : myTriangle.getSides()) { 
            assertTrue(myTriangle.longestLineWithin() >= side);
        }
    }
}
