package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Paint: Determines the quantity of paint cans required.
 *
 * @author David
 * @version 2022
 *
 */
public class Paint {
    
    /**
     * Defined constant for COVERAGE.
     * 
     * @param args command-line arguments (unused)
     */
    static final int COVERAGE = 400;
    
    /**
     * Defined constant for WALLS.
     * 
     * @param args command-line arguments (unused)
     */
    static final int WALLS = 4;
    
    /**
     * Drives the program.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the room in feet: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter the width of the room in feet: ");
        double width = sc.nextDouble();
        
        System.out.print("Enter the height of the room in feet: ");
        double height = sc.nextDouble();
        
        System.out.print("Enter the number of coats: ");
        double coats = sc.nextDouble();
        
        double sideArea = height * length;
        double topArea = width * length;
        double surfaceArea = (WALLS * sideArea) + topArea;
        double coverageNeeded = (surfaceArea * coats);
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        System.out.println("You will need "
                    + Math.ceil(cansOfPaintNeeded) + " cans of paint.");
        
        
    }       

}
