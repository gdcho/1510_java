package q1;

import java.util.Scanner;

/**
 * Change: Prints the change from a value as integers.
 *
 * @author David Cho 
 * @version 2023
 */
public class Change {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        final int hundred = 100;
        final int tens = 10;
        final int fives = 5;
        final int twos = 2;
        final int ones = 1;
        final int quarters = 25;
        final int dimes = 10;
        final int nickels = 5;
        final int pennies = 1;
        
        System.out.println("Please input your value: ");
        Scanner userInput = new Scanner(System.in);
        double value = userInput.nextDouble();
        
        //Changing decimal floating values as integer values.
        int decimalValue = (int) (value * hundred) - ((int) value * hundred);
        
        //Calculations for the ten dollar bills.
        int tensValue = (int) value / tens;
        value = ((int) value - (tensValue * tens));
        
        //Calculations for the five dollar bills.
        int fivesValue = (int) value / fives;
        value = ((int) value - (fivesValue * fives));
        
        //Calculations for the toonies.
        int twosValue = (int) value / twos;
        value = ((int) value - (twosValue * twos));
        
        //Calculations for the loonies.
        int onesValue = (int) value / ones;
        
        //Calculations for the quarters.
        int quartersValue = decimalValue / quarters;
        
        //Calculations for the dimes.
        decimalValue = decimalValue - (quartersValue * quarters);
        int dimesValue = decimalValue / dimes;
        
        //Calculations for the nickels.
        decimalValue = decimalValue - (dimesValue * dimes);
        int nickelsValue = decimalValue / nickels;
        
        //Calculations for the pennies.
        decimalValue = decimalValue - (nickelsValue * nickels);
        int penniesValue = decimalValue / pennies;
        
        System.out.println(tensValue + " ten dollar bills\n"
                + fivesValue + " five dollar bills\n"
                + twosValue + " toonies\n"
                + onesValue + " loonies\n"
                + quartersValue + " quarters\n"
                + dimesValue + " dimes\n"
                + nickelsValue + " nickles\n"
                + penniesValue + " pennies");
        
        userInput.close();
        
    }

}
