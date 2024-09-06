package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.AbstractTestDescriptor;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        // This test is important because it shows if the largestOfThere() function actually returns the largest of three. 
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));
        // This here is to make sure that if negative numbers are used it should throw an IllegalArgumentException.
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(9.90, FunctionPractice.calcSalePrice(10.00, 10.0, 10.0));
        assertEquals(22.31, FunctionPractice.calcSalePrice(25.00, 15.0, 5.0));
        assertEquals(15.91, FunctionPractice.calcSalePrice(21.00, 25.0, 1.0));
    }

    @Test 
    public void testIsGoodDog() {
        assertEquals(true, FunctionPractice.isGoodDog(7,300,true));
        assertEquals(true, FunctionPractice.isGoodDog(5, 5, true));
        assertEquals(true, FunctionPractice.isGoodDog(2, 8, false));

        assertEquals(false, FunctionPractice.isGoodDog(2, 0, false));
        assertEquals(false, FunctionPractice.isGoodDog(2, 2, true));
        assertEquals(false, FunctionPractice.isGoodDog(2, 6, false));

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.isGoodDog(1, 1000, false));
    }

    @Test
    public void testFindFirstLargest() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(70);
        nums.add(5); 
        nums.add(3); 
        nums.add(70);
        assertEquals(1,FunctionPractice.findFirstLargest(nums));

        nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(0);
        nums.add(5); 
        nums.add(1);
        nums.add(5);
        assertEquals(2,FunctionPractice.findFirstLargest(nums));

        nums = new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findFirstLargest(nums));

    }

    @Test 
    public void testFindLastLargest() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(70);
        nums.add(5); 
        nums.add(3); 
        nums.add(70);
        assertEquals(4, FunctionPractice.findLastLargest(nums));

        nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(0);
        nums.add(5); 
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(2);
        assertEquals(5,FunctionPractice.findLastLargest(nums));

        nums = new ArrayList<Integer>();
        assertEquals(-1, FunctionPractice.findLastLargest(nums));

    }

    @Test
    public void testFindFirstMostOccurencesOfLetter() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hello");
        words.add("World");
        words.add("This");
        words.add("Is");
        words.add("A");
        words.add("Test");
        assertEquals("Hello",FunctionPractice.findFirstMostOccurencesOfLetter(words, 'l'));
        assertEquals("This",FunctionPractice.findFirstMostOccurencesOfLetter(words, 's'));

        words = new ArrayList<String>();
        words.add("Never");
        words.add("Gonna");
        words.add("Give");
        words.add("You");
        words.add("Up");
        words.add("Never");
        words.add("Gonna");
        words.add("Let");
        words.add("You");
        words.add("Down");

        assertEquals("Gonna", FunctionPractice.findFirstMostOccurencesOfLetter(words, 'n'));
    }
    
}
