package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * 
 * @author David
 * @version 2023
 *
 */
public class BaseballStats {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        // Read in the file name from input
        Scanner fileScan;
        Scanner lineScan;
        Scanner scan = new Scanner(System.in);
        
        // Saves file name input as fileName
        System.out.print("Enter the file name: ");
        String fileName = scan.nextLine();
        scan.close();
        
        // fileScan scanner to read the file
        File file = new File("resources/", fileName);
        fileScan = new Scanner(file);

        // Process each line in the file
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();

            // lineScan scanner to parse each line
            lineScan = new Scanner(line);
            lineScan.useDelimiter(",");

            // Print the name of the player
            String name = lineScan.next();
            System.out.print(name + ": ");

            // Count the number of hits, outs, walks, and sacrifices
            int hits = 0; 
            int outs = 0;
            int walks = 0;
            int sacrifices = 0;
            while (lineScan.hasNext()) {
                String result = lineScan.next();
                if (result.equals("h")) {
                    hits++;
                } else if (result.equals("o")) {
                    outs++;
                } else if (result.equals("w")) {
                    walks++;
                } else if (result.equals("s")) {
                    sacrifices++;
                }
                // Print each at-bat code
                System.out.print(result);
            }
            lineScan.close();

            // Calculate and print batting average
            double battingAvg = (double) hits / (hits + outs);
            System.out.printf(" (Hits: %d, Outs: %d, Walks: %d, "
                    + "Sacrifices: %d, Batting Average: %.3f)\n",
                    hits, outs, walks, sacrifices, battingAvg);
        }

        fileScan.close();
    }
}


