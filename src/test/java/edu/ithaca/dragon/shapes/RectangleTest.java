package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertThrows;
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

    public void TestLongestLineWithin() {

    }
}
