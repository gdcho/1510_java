package ca.bcit.comp1510.lab11;

/**
 * Represents a program that prints the average if valid.
 * 
 * @author David
 * @version 2023
 */
public class Average {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments");
            return;
        }

        double sum = 0;
        boolean invalidInput = false;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid, non-integer value found: " + arg);
                invalidInput = true;
            }
        }

        if (!invalidInput) {
            double average = sum / args.length;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No valid integer");
        }
    }

}
