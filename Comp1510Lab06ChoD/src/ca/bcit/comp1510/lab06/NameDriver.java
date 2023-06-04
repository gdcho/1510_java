
package ca.bcit.comp1510.lab06;

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
        
        //Empty name
        Name emptyName = new Name("", "", "");
        System.out.println(emptyName);
        
        Name myName = new Name("", "david", "cho");

        //name toString()
        System.out.println(myName.toString() + "\n");
        
        //sumLength()
        int length = myName.sumLength();
        System.out.println("The length of your full name is: " 
                + myName.sumLength() + "\n");
       
        //getCharacter() at max length
        System.out.println(myName.getCharacter(length) + "\n");
        
        //getCharacter() at length greater than max
        System.out.println(myName.getCharacter(length + 1) + "\n");
        
    }

}
