
package ca.bcit.comp1510.lab05;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * GeometryDriver: Driver for Sphere, Cube, and Cone.
 *
 * @author David Cho
 * @version 2023
 */
public class GeometryDriver {
    
    /**
     * Drives the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        DecimalFormat decimal = new DecimalFormat("0.000");
        
        //Sphere
        System.out.println("Input the x-coordinate,"
                + " y-coordinate, z-coordinate,"
                + " and radius for the sphere: ");
        Sphere sphere = new Sphere(userInput.nextDouble(), 
                userInput.nextDouble(), userInput.nextDouble(), 
                userInput.nextDouble());
        System.out.println("The surface of the sphere: " 
                + decimal.format(sphere.surfaceArea()) 
                + "\n" + "The volume of the sphere: " 
                + decimal.format(sphere.volume()) + "\n");
        
        //Cube
        System.out.println("Input the x-coordinate,"
                + " y-coordinate, z-coordinate,"
                + " and the edge length for the cube: ");
        Cube cube = new Cube(userInput.nextDouble(), userInput.nextDouble(),
                userInput.nextDouble(), userInput.nextDouble());
        System.out.println("The surface of the cube: " 
                + decimal.format(cube.surfaceArea()) 
                + "\n" + "The volume of the cube: " 
                + decimal.format(cube.volume()) 
                + "\n" + "The face diagonal of the cube: " 
                + decimal.format(cube.faceDiagonal()) 
                + "\n" + "The space diagonal of the cube: " 
                + decimal.format(cube.spaceDiagonal()) + "\n");
        
        //Cone
        System.out.println("Input the radius and height for the cone: ");
        Cone cone = new Cone(userInput.nextDouble(), userInput.nextDouble());
        System.out.println("The volume of the cube: " 
                + decimal.format(cone.volume()) 
                + "\n" + "The slant height of the cube: " 
                + decimal.format(cone.slantHeight()) 
                + "\n" + "The surface area of the cube: " 
                + decimal.format(cone.surfaceArea()) + "\n");
        
        //Number format
        NumberFormat number = NumberFormat.getInstance();
        number.setGroupingUsed(true);
        final int three = 3;
        number.setMinimumFractionDigits(three);
        number.setMaximumFractionDigits(three);
        
        System.out.println("Number format");
        System.out.println("Please enter the radius and height for the cone: ");
        Cone coneNum = new Cone(userInput.nextDouble(), userInput.nextDouble());
        System.out.println("The volume of the cube: " 
                + number.format(coneNum.volume()) 
                + "\n" + "The slant height of the cube: " 
                + number.format(coneNum.slantHeight()) 
                + "\n" + "The surface area of the cube: " 
                + number.format(coneNum.surfaceArea()));
        
        userInput.close();
    }
}
