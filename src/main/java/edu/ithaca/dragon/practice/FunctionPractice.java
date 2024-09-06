package edu.ithaca.dragon.practice;

import java.util.List;
import java.util.Arrays;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        int[] nums = {first, second, third}; 
        Arrays.sort(nums); 
        if (nums[0] < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        return nums[2];


    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        originalPrice = originalPrice - (originalPrice * (discountPercent/100));
        originalPrice += (originalPrice * salesTax/100);
        BigDecimal roundedPrice = new BigDecimal(originalPrice);
        return roundedPrice.setScale(2,RoundingMode.HALF_UP).doubleValue();
        
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        // If Days Since Shoes Chewed > yearsOld, throw Exception.
        /* If the dog has grabbed the paper today and they have not chewed shoes 
        in the past 3 days, they are good */
        // Not grabbed the paper today but have not chewed shoes in past week, true.
        // else False
        if (daysSinceShoesChewed > (yearsOld * 365)) {
            throw new IllegalArgumentException("daysSinceShoesChewed cannot be longer than the dogs age.");
        }
        else if (daysSinceShoesChewed > 3 && fetchedThePaperToday){
            return true;
        }
        else if (daysSinceShoesChewed > 7) {
            return true;
        }

        return false;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        int index = -1;
        int largestNumber = Integer.MIN_VALUE; 
        for (int i=0; i < numbers.size(); i++) {
            if (numbers.get(i) > largestNumber) {
                largestNumber = numbers.get(i); 
                index = i;
            }
        }
        return index;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        int index = -1; 
        int largestNumber = Integer.MIN_VALUE;
        for (int i=numbers.size()-1; i >= 0; i--) {
            if (numbers.get(i) > largestNumber) {
                largestNumber = numbers.get(i); 
                index = i;
            }
        }
        return index;
        
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        String word = ""; 
        int largestOccurences = 0;
        for (int i=0; i < words.size(); i++) {
            int occurences = 0;

            for (int j=0; j<words.get(i).length(); j++){
                if (words.get(i).charAt(j) == letter) {
                    occurences++;
                }
            }

            if (occurences > largestOccurences) {
                word = words.get(i);
                largestOccurences = occurences;
            }
        }
        if (largestOccurences == 0) {
            throw new IllegalArgumentException("Letter not found.");
        }
        return word;
    }


}
