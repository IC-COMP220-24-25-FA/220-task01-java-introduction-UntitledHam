package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(3.1415, myCircle.calcArea(), 0.0001);
        
        myCircle = new Circle(5.5);
        assertEquals(95.0331, myCircle.calcArea(), 0.0001);

        myCircle = new Circle(0.001);
        assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    }

    @Test 
    public void testCalcLongestLineWithin() {
       Circle myCircle = new Circle(1);
       assertEquals(myCircle.longestLineWithin(), 2);

       myCircle = new Circle(3);
       assertEquals(myCircle.longestLineWithin(), 6); 

       myCircle = new Circle(20); 
       assertEquals(myCircle.longestLineWithin(), 40);

    }

    @Test
    public void testDoubleSize() {
        Circle refCircle = new Circle(1); 
        Circle doubleCircle = new Circle(1);  
        doubleCircle.doubleSize();

        assertEquals(refCircle.calcArea() * 2, doubleCircle.calcArea(), 0.005);
        
        refCircle = new Circle(5); 
        doubleCircle = new Circle(5); 
        doubleCircle.doubleSize();
        assertEquals(refCircle.calcArea() * 2, doubleCircle.calcArea(), 0.005); 

        refCircle = new Circle(10); 
        doubleCircle = new Circle(10); 
        doubleCircle.doubleSize();
        assertEquals(refCircle.calcArea() * 2, doubleCircle.calcArea(), 0.005); 

    }
    /*@Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }*/


    
}
