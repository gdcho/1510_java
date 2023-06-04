
package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Factorial: Represents the factorial of a nonnegative number.
 * 
 * @author David
 * @version 2023
 *
 */
public class Factorial {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Integer from readInt(Scanner scan).
        int number = readInt(scan);
        
        //Prints if number is less than zero.
        while (number < 0) {
            System.out.println("Error! A non-negative number is required.\n");
            number = readInt(scan);
        }
        
        //Calculates factorial.
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + " factorial is: " + factorial);
    }

    private static int readInt(Scanner scan) {
        System.out.println("Enter an integer value: ");
        
        //Prints if number is not an integer
        while (!scan.hasNextInt()) {
            System.out.println("Error! A number is required.\n");
            System.out.println("Enter an integer value: ");
            scan.next();
        }
        return scan.nextInt();
    }
}

