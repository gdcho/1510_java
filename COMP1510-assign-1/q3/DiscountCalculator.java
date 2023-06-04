package q3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * DiscountCalculator: Returns float and percentage value for discount.
 *
 * @author David Cho
 * @version 2023
 */
public class DiscountCalculator {

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        final float max = 75;
        final int hundred = 100;
        
        DecimalFormat df = new DecimalFormat("##%");
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Number of cheese: ");
        int cheese = userInput.nextInt();
        
        System.out.println("Number of referrals: ");
        int referrals = userInput.nextInt();
        
        float percentage = cheese + referrals;
        
        System.out.println("Your discount is: " + Math.min(percentage, max) 
                    + " or " 
                    + df.format(Math.min(percentage / hundred, max / hundred)));
        
        userInput.close();
       
    }

}
