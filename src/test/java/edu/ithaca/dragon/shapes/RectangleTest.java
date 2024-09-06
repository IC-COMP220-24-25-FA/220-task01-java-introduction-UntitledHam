package edu.ithaca.dragon.shapes;
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

    @Test 
    public void TestDoubleSize() {
        Rectangle refRectangle = new Rectangle(1,1);
        Rectangle doubleRectangle = new Rectangle(1, 1);
        doubleRectangle.doubleSize();

        assertEquals(refRectangle.calcArea() * 2, doubleRectangle.calcArea(), 0.005);

        refRectangle = new Rectangle(5,4);
        doubleRectangle = new Rectangle(5,4);
        doubleRectangle.doubleSize();

        assertEquals(refRectangle.calcArea() * 2, doubleRectangle.calcArea(), 0.005);
        
        refRectangle = new Rectangle(10,5);
        doubleRectangle = new Rectangle(10, 5);
        doubleRectangle.doubleSize();

        assertEquals(refRectangle.calcArea() * 2, doubleRectangle.calcArea(), 0.005);



    }
    
}
