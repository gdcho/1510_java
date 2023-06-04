/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * Distance: Calculates the distance between two points.
 * 
 * @author David
 * @version 2022
 *
 */
public class Distance {

    /**
     * Drives the program.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
     
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the first x and y coordinate"
                + " (with a space in between): ");
        double x1 = userInput.nextDouble();
        double y1 = userInput.nextDouble();
        System.out.println("Enter the second x and y coordinate: "
                + " (with a space in between): ");
        double x2 = userInput.nextDouble();
        double y2 = userInput.nextDouble();
        
        System.out.println("The coordinate of the first point is: "
                            + "(" + x1 + " , " + y1 + ")");
        
        System.out.println("The coordinate of the second point is: "
                + "(" + x2 + " , " + y2 + ")");
        
        double x = x2 - x1;
        double y = y2 - y1;
        
        double result = Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));
        System.out.println("The distance is: " + result);
        
        DecimalFormat decResult = new DecimalFormat("#.##");
        System.out.println("The distance in two decimal places: " 
                            + decResult.format(result));
        
        userInput.close();
                

    }

}
