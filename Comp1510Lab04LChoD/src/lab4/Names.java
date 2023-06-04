
package lab4;

import java.util.Scanner;

/**
 * Names: Prints name from user input.
 * 
 * @author David
 * @version 2022
 *
 */
public class Names {

    /**
     * river program prints users full name.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your first name: ");
        String first = userInput.nextLine();
        
        System.out.println("Please input your middle name: ");
        String middle = userInput.nextLine();
        
        System.out.println("Please input your last name: ");
        String last = userInput.nextLine();
        
        Name userName = new Name(first, middle, last);
        userName.setFirstName(userName.getFirstName());
        userName.setMiddleName(userName.getMiddleName());
        userName.setLastName(userName.getLastName());
        System.out.println("Your name is: " + userName);
        
        userInput.close();

    }

}
