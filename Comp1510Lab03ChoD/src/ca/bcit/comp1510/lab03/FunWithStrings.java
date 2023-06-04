/**

 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * FunWithStrings: Prints strings.
 * 
 * @author David
 * @version 2022
 *
 */
public class FunWithStrings {

    /**
     * Drives the program.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        String userInput;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the title of your favourite book: ");
        userInput = scan.nextLine();
        System.out.println("Your favourite book is: " + userInput);
        //bookTitle = scan.next(); 
        //Scanner's next method() only reads the next token,
        //while the nextLine() method reads the entire line.
        
        System.out.println("The length of the title is: " + userInput.length()
                            + " characters long");
        System.out.println("Does the title of the book start with \"The\"? "
                            + "true or false?: " + userInput.startsWith("The"));
        
        userInput.toUpperCase();
        System.out.println("The book title did not change to uppercase: " 
                            + userInput);
        //String object is immutable.
        
        String newUserInput = userInput.toUpperCase();
        System.out.println("The title of the book in uppercase: " 
                            + newUserInput);
        //Invoking the toUpperCase() method,
        //onto a new string variable can make it uppercase.
        String lowerCase = userInput.toLowerCase();
        System.out.println("The title of the book in lowercase: " + lowerCase);
        
        String trimmedUserInput = userInput.trim();
        
        System.out.println("The title of the trimmed book is: " 
                            + trimmedUserInput);
        System.out.println("The length of the trimmed title is: " 
                            + trimmedUserInput.length()
                            + " characters long");
        /*
         *a. Book title with nothing but tabs:
         *      With tabs, the length is n-tab characters long,
         *      and when trimmed, it is 0 characters long.
         *b. Book title with nothing but spaces:
         *      With spaces, the length is n-space characters long,
         *      and when trimmed, it is 0 characters long.
         *c. Book title with spaces, then a word, then spaces:
         *      With spaces, then a word, then spaces, 
         *      the length includes the total length 
         *      minus the length of the spaces. 
         *d. Book title with spaces, then some words, then more spaces:
         *      With spaces, then some words, then more spaces,
         *      the length includes the total length of the word
         *      minus the length of spaces before and after the words. 
         * 
         */
        
        
        System.out.println("Title of book fully trimmed: " + trimmedUserInput);
        
        String lowerCaseTrim = trimmedUserInput.toLowerCase();
        System.out.println("Title of book in lowercase: " + lowerCaseTrim);
        System.out.println("Title of book, fully trimmed, in lowercase, with"
                            + "the first and last letters capitalized: " 
                            + lowerCaseTrim.substring(0, 1).toUpperCase()
                            + lowerCaseTrim.substring(1, 
                                    lowerCaseTrim.length() - 1).toLowerCase()
                            + lowerCaseTrim.substring(lowerCaseTrim.length()
                                    - 1, lowerCaseTrim.length()).toUpperCase());
        
        scan.close();
       
        
        //the book

    }
    
}
