package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Driver class for RandomWalker
 * that depicts a drunk walker.
 * 
 * @author David
 * @version 2023
 */
public class DrunkWalker {
    /** 
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter boundary size: ");
        int boundary = sc.nextInt();
        System.out.print("Enter number of steps: ");
        int maxSteps = sc.nextInt();
        System.out.print("Enter number of drunks: ");
        int numDrunks = sc.nextInt();

        int numFalls = 0;
        for (int i = 1; i <= numDrunks; i++) {
            RandomWalker drunk = new RandomWalker(maxSteps, boundary);
            drunk.walk();
            if (!drunk.inBounds()) {
                numFalls++;
            }
        }

        System.out.println("Total number of tests: " + numDrunks);
        System.out.println("Number of falls: " + numFalls);
        
        sc.close();
    }
}
