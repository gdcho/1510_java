
package lab4;

/**
 * Name: Represents the first, middle, and last names of the user.
 * 
 * @author David
 * @version 2022
 *
 */
public class Name {
    /*** Private string for first name.*/
    private String firstName;
    
    /*** Private string for middle name.*/
    private String middleName;
    
    /*** Private string for last name.*/
    private String lastName;
    
    /**
     * Constructor for first names, middle name, and last name strings.
     * 
     * @param first first name
     * @param middle middle name
     * @param last last name
     */
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    /**
     * Returns the first name as a string.
     * @return firstName as a String
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns the middle name as a string.
     * @return middleName as a String
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * Returns the last name as a string.
     * @return lastName as a String
     */
    public String getLastName() {
        return lastName;
    }  
    
    /**
     * Mutates the first name.
     * @param name firstName 
     */
    public void setFirstName(String name) {
        firstName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length());
    }
    
    /**
     * Mutates the middle name.
     * @param name middleName
     */
    public void setMiddleName(String name) {
        middleName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length());
    }
    
    /**
     * Mutates the last name.
     * @param name lastName
     */
    public void setLastName(String name) {
        lastName = name.substring(0, 1).toUpperCase() + name.substring(1, 
                name.length());
    }
    
    /**
     * Returns the first name, middle name, last name as a string.
     * @return firstName, middleName, lastName as a String
     */
    public String toString() {
        return firstName + " " + middleName + " " + lastName;
        
    }
    
}

