package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * Circle: Calculates values for a circle.
 *
 * @author David
 * @version 2022
 *
 */
public class Circle {
    
    /**
     * Defined constant for PI.
     * 
     * @param args command-line arguments (unused)
     */
    static final double PI = 3.14159;
    
    /**
     * Drives the program.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        
        double radius;
        double circumference;
        double area;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter the circle's radius: ");
        radius = myScanner.nextDouble();
        
        //The radius doubled
        double doubleRadius = radius * 2;
        
        circumference = (2 * PI * radius);
        //The circumference value when radius is doubled
        double drCircumference = (2 * PI * doubleRadius);
        
        area = (PI * radius * radius);
        //The area value when the radius is doubled
        double drArea = (PI * doubleRadius * doubleRadius);
        
        System.out.println("The circle's area: " + area);
        System.out.println("The circle's area when the radius is doubled is: " 
                            + drArea);
        
        double circumferenceTimes = (drCircumference / circumference);
        double areaTimes = (drArea / area);
        
        System.out.println("When the radius is doubled, "
                            + "the circumference increases "
                            + circumferenceTimes 
                            + " times and the area increases "
                            + areaTimes + " times.");
        
        myScanner.close();
        
    }

}
