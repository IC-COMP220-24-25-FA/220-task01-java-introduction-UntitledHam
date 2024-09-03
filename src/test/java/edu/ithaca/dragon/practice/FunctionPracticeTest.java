package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.AbstractTestDescriptor;

import java.util.ArrayList;

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


    }

    @Test
    public void testFindFirstLargest() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(70);
        nums.add(5); 
        nums.add(3); 
        nums.add(70);
        assertEquals(FunctionPractice.findFirstLargest(nums), 1);

        nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(0);
        nums.add(5); 
        nums.add(1);
        nums.add(5);
        assertEquals(FunctionPractice.findFirstLargest(nums), 2);

        nums = new ArrayList<Integer>();
        assertEquals(nums, -1);

    }

    @Test 
    public void testFindLastLargest() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(70);
        nums.add(5); 
        nums.add(3); 
        nums.add(70);
        assertEquals(FunctionPractice.findFirstLargest(nums), 4);

        nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(0);
        nums.add(5); 
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(2);
        assertEquals(FunctionPractice.findFirstLargest(nums), 5);

        nums = new ArrayList<Integer>();
        assertEquals(nums, -1);

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
        assertEquals(FunctionPractice.findFirstMostOccurencesOfLetter(words, 'l'), "Hello");
        assertEquals(FunctionPractice.findFirstMostOccurencesOfLetter(words, 's'), "This");

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

        assertEquals(FunctionPractice.findFirstMostOccurencesOfLetter(words, 'n'), "Gonna");
    }
    
}
