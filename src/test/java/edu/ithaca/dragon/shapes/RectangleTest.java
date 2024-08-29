package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void TestArea(){
        Rectangle myRectangle = new Rectangle(1,1); 
        assertEquals(myRectangle.calcArea(), 1.0);

        myRectangle = new Rectangle(10,5); 
        assertEquals(myRectangle.calcArea(), 50.0);
    } 

    @Test
    public void TestLongestLineWithin() {
        Rectangle myRectangle = new Rectangle(1,1); 
        assertEquals(myRectangle.longestLineWithin(), Math.sqrt(2));

        myRectangle = new Rectangle(10,10); 
        assertEquals(myRectangle.longestLineWithin(), Math.sqrt(200));
        
        myRectangle = new Rectangle(2,50); 
        assertEquals(myRectangle.longestLineWithin(), Math.sqrt(2504));

    }
}
