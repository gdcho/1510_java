package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Driver class for RandomWalker.
 * 
 * @author David
 * @version 2023
 */
public class TestWalker {
    
    /** 
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final int five = 5;
        final int ten = 10;
        
        RandomWalker walker1 = new RandomWalker(ten, five);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum steps: ");
        int maxSteps = sc.nextInt();
        System.out.print("Enter boundary size: ");
        int boundary = sc.nextInt();
        RandomWalker walker2 = new RandomWalker(maxSteps, boundary);

        System.out.println("First walker:\n" + walker1.toString());
        System.out.println("Second walker:\n" + walker2.toString());
        System.out.println("\nSteps taken:");
        final int times = 5;
        for (int i = 1; i <= times; i++) {
            walker1.takeStep();
            walker2.takeStep();
            System.out.println(walker1.toString()
                    + " First walker maximum distance: " 
                    + walker1.getMaximumDistance());
            System.out.println(walker2.toString() 
                    + " Second maximum distance: " 
                    + walker2.getMaximumDistance());
        }
        
        System.out.println("\nAfter steps:");
        System.out.println("First walker: " + walker1.toString());
        System.out.println("Second walker :" + walker2.toString());
        
        final int thirdMaximumSteps = 200;
        final int thirdBoundarySize = 10;
        RandomWalker thirdRandomWalker = 
                new RandomWalker(thirdMaximumSteps, thirdBoundarySize);
        System.out.println("\nThird walker: " + thirdRandomWalker.toString());
        thirdRandomWalker.walk();
        System.out.println("After steps:\n" + thirdRandomWalker.toString());
        
        sc.close();

    }
    
}
