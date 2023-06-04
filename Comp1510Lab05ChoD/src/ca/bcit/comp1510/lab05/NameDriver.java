
package ca.bcit.comp1510.lab05;

import java.util.Random;

/**
 * Driver for Name.
 * 
 * @author David
 * @version 2023
 *
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        System.out.println("\'");

        Name myName = new Name("Gun-Hee", "David", "Cho");

        //sumLength()
        System.out.println("The length of your full name is: " 
                + myName.sumLength() + "\n");
        
        //nameUppercase()
        System.out.println("Your initials in upper case is: " 
                + myName.initialsUppercase() + "\n");
        
        //getNth()
        
        Random rand = new Random();
        String fullName = myName.getFirstName() 
                + myName.getMiddleName() + myName.getLastName();
        int nth = rand.nextInt(fullName.length());
        System.out.print("Random int to find the nth character is: " 
                + nth + " and character at " + nth
                + "th position is: " + myName.getNth(nth) + "\n" + "\n");
        
        //fullName()
        System.out.println("Last name, first name middle name: " 
                + myName.fullName() + "\n");
        
        //isEqual()
        System.out.println("Is first name equal to Gun-Hee? " 
                + myName.isEqual("Gun-Hee") + "\n");
        
        //equaltoNameObj()
        System.out.println("Is the three parts of the name object"
                + "the same as the three parts of “this” Name object? " 
                + myName.equaltoNameObj(myName));
    }

}
