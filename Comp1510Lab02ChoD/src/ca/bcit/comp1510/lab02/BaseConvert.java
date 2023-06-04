package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * BaseConvert: Converts from base 10.
 *
 * @author David
 * @version 2022
 *
 */
public class BaseConvert {
    
    /**
     * Drives the program.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        int base10number; 
        int base; 
        int maximumNumber = 0; 
        // in 4 digits in the new base
        int place0; 
        int place1;
        int place2;
        int place3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Base Conversion Program");
        System.out.print("Please enter a base (2-9): ");
        base = scan.nextInt();
        maximumNumber = (base * base * base * base) - 1;
        System.out.println("The max base 10 number to convert for that base is "
                            + maximumNumber);
        System.out.print("Please enter a base 10 number to convert: ");
        base10number = scan.nextInt();
        // Conversion
        // place 0
        place0 = base10number % base;
        // place1
        base10number = base10number / base;
        place1 = base10number % base;
        // place2
        base10number = base10number / base;
        place2 = base10number % base;
        // place3
        base10number = base10number / base;
        place3 = base10number % base;
        
        String baseBNumber = new String(place3 + "" + place2 
                                        + "" + place1 + "" + place0);
        System.out.print("The converted values is: " + baseBNumber);
        scan.close();

    }

}
