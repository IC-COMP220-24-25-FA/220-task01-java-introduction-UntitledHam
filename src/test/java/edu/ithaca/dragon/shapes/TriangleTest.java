package edu.ithaca.dragon.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    public void testCalcHeight() { 
        Triangle myTriangle = new Triangle(1,1,1); 
        0.5 * myTriangle.calcHeight()
}
