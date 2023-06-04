/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Dice: Randomly generates a dice number.
 * 
 * @author David
 * @version 2022
 *
 */
public class Dice {

    /**
     * Drives the program.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        final int four = 4;
        final int six = 6;
        final int eight = 8;
        final int ten = 10;
        final int twelve = 12;
        final int twenty = 20;
        
        Random generator = new Random();
        
        //4-sided die
        int fourSides = generator.nextInt(four) + 1;
        System.out.println("4-sided die roll: " + fourSides);
        
        //6-sided die
        int sixSides = generator.nextInt(six) + 1;
        System.out.println("6-sided die roll: " + sixSides);
        
        //8-sided die
        int eightSides = generator.nextInt(eight) + 1;
        System.out.println("8-sided die roll: " + eightSides);
        
        //10-sided die
        int tenSides = generator.nextInt(ten) + 1;
        System.out.println("10-sided die roll: " + tenSides);
     
        //12-sided die
        int twelveSides = generator.nextInt(twelve) + 1;
        System.out.println("12-sided die roll: " + twelveSides);
        
        //20-sided die
        int twentySides = generator.nextInt(twenty) + 1;
        System.out.println("20-sided die roll: " + twentySides);
        
        //Sum of the rolls
        System.out.println("The sum of the dice rolls is: " 
                            + (fourSides + sixSides + eightSides + tenSides
                            + twelveSides + twentySides));
        
    }

}
