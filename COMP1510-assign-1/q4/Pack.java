package q4;

import java.util.Scanner;

/**
 * Pack: Returns encoded and decoded values as integer and string.
 * 
 * @author David Cho
 * @version 2023
 */
public class Pack {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        final int zero = 0;
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int base = 56;
        
        String input;
        char a = 'A';
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your 5 MIX-character value: ");
        input = userInput.next();
        
        char c1 = input.charAt(zero);
        int c1Value = c1 - a + one;
        
        char c2 = input.charAt(one);
        int c2Value = c2 - a + one;
        
        char c3 = input.charAt(two);
        int c3Value = c3 - a + one;
        
        char c4 = input.charAt(three);
        int c4Value = c4 - a + one;
        
        char c5 = input.charAt(four);
        int c5Value = c5 - a + one;
        
        //Calculations for encoded value
        int encodedValue = (c1Value * base * base * base * base)
                + (c2Value * base * base * base)
                + (c3Value * base * base)
                + (c4Value * base) + c5Value;
        
        System.out.println("Your encoded value is " + encodedValue);
        
        //Calculations for decoded value
        int c1Decode = encodedValue / (base * base * base * base);
        encodedValue = encodedValue % (base * base * base * base);
        int c2Decode = encodedValue / (base * base * base);
        encodedValue = encodedValue % (base * base * base);
        int c3Decode = encodedValue / (base * base);
        encodedValue = encodedValue % (base * base);
        int c4Decode = encodedValue / (base);
        encodedValue = encodedValue % (base);
        int c5Decode = encodedValue;
        
        char c1Char = (char) (c1Decode + a - one);
        char c2Char = (char) (c2Decode + a - one);
        char c3Char = (char) (c3Decode + a - one);
        char c4Char = (char) (c4Decode + a - one);
        char c5Char = (char) (c5Decode + a - one);
        
        System.out.println("Your decoded value is: " + c1Char 
                    + c2Char + c3Char + c4Char + c5Char);
        
        userInput.close();
    }
}
