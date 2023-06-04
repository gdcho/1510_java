package q2;

import java.util.Scanner;

/**
 * Sqrt: Prints the square root estimates as doubles.
 *
 * @author David Cho
 * @version 2023
 */
public class Sqrt {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        double a;
        double s;
        
        System.out.println("Please input your value: ");
        Scanner userInput = new Scanner(System.in);
        
        a = userInput.nextDouble();
        s = (a + 1) / 2;
        System.out.println("First estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Second estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Third estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Fourth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Fifth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Sixth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Seventh estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Eighth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Ninth estimate: " + s);
        s = (s + a / s) / 2;
        System.out.println("Tenth estimate: " + s);
        
        userInput.close();
        
    }

}
