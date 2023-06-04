
package ca.bcit.comp1510.lab05;

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
    
    /**
     * Returns the  length of name.
     * 
     * @return sumLengths as a int
     */
    public int sumLength() {
        return firstName.length() + middleName.length() + lastName.length();
    }
    
    /**
     * Returns the three initials in upper case.
     * 
     * @return initialsUppercase as a String
     */
    public String initialsUppercase() {
        String firstInitial = firstName.substring(0, 1).toUpperCase();
        String middleInitial = middleName.substring(0, 1).toUpperCase();
        String lastInitial = lastName.substring(0, 1).toUpperCase();
        return firstInitial + middleInitial + lastInitial;
    }
    
    /**
     * Returns the nth character of this full name.
     * 
     * @param n as a int
     * @return getNCharacter as a char
     */
    public char getNth(int n) {
        String fullName = firstName + middleName + lastName;
        return fullName.charAt(n - 1);
    }
    
    /**
     * Returns the full name as last name, first name middle name.
     * 
     * @return fullName as a String
     */
    public String fullName() {
        return lastName + ", " + firstName + " " + middleName;
    }
    
    //3.e
    /**
     * Returns true if the string parameter you enter equals to the first name.
     * 
     * @param str as a String
     * @return isEqual as a boolean
     */
    public boolean isEqual(String str) {
        return firstName.equals(str);
    }
    
    //3.f
    /**
     * Returns if the Name object you enter equals to the Name object.
     * 
     * @param name as a Name object
     * @return isEqualtoNameObj as a boolean
     */
    public boolean equaltoNameObj(Name name) {
        return this.firstName.equals(name.getFirstName())
                && this.middleName.equals(name.getMiddleName()) 
                && this.lastName.equals(name.getLastName());
    }
}

