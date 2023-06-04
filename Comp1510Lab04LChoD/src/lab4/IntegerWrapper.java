
package lab4;

import java.util.Scanner;

/**
 * IntegerWrapper: Prints integer and string values.
 * 
 * @author David
 * @version 2022
 *
 */
public class IntegerWrapper {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input an integer value: ");
        int intValue = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Your value converted to base 2: " 
                    + Integer.toBinaryString(intValue));
        System.out.println("Your value converted to base 8: " 
                + Integer.toOctalString(intValue));
        System.out.println("Your value converted to base 16: " 
                + Integer.toHexString(intValue));
        
        System.out.println("The maximum possible Java integer value: "
                + Integer.MAX_VALUE);
        System.out.println("The minimum possible Java integer value: "
                + Integer.MIN_VALUE);
        
        System.out.println("Enter two integers, one per line: ");
        String int1 = userInput.next();
        String int2 = userInput.next();
        
        System.out.println("The sum of the two integers: "
                + (Integer.parseInt(int1) 
                + Integer.parseInt(int2)));
        
        userInput.close();

    }
    
}
