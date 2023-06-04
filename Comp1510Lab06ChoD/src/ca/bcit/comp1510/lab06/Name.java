
package ca.bcit.comp1510.lab06;

/**
 * Name: Represents the first, middle, and last names of the user.
 * 
 * @author David
 * @version 2023
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
     * @param firstName first name
     * @param middleName middle name
     * @param lastName last name
     */
    public Name(String firstName, String middleName, String lastName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            this.firstName = "Jane";
        } else {
            this.firstName = formatName(firstName);
        }
        
        if (middleName == null || middleName.trim().isEmpty()) {
            this.middleName = "Smith";
        } else {
            this.middleName = formatName(middleName);
        }
        
        if (lastName == null || lastName.trim().isEmpty()) {
            this.lastName = "Doe";
        } else {
            this.lastName = formatName(lastName);
        }
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
     * @param firstName firstName 
     */
    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = formatName(firstName);
        }
    }
    
    /**
     * Mutates the middle name.
     * @param middleName middleName
     */
    public void setMiddleName(String middleName) {
        if (middleName != null && !middleName.trim().isEmpty()) {
            this.middleName = formatName(middleName);
        }
    }
    
    /**
     * Mutates the last name.
     * @param lastName lastName
     */
    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = formatName(lastName);
        }
    }
    
    /**
     * Returns the character at index n.
     * @param index character
     * @return returns character as char
     */
    public char getCharacter(int index) {
        if (index + 1 >= toString().length()) {
            return '@';
        }
        return toString().charAt(index + 1);
    }

    private String formatName(String name) {
        String formattedName = name.trim();
        if (!formattedName.isEmpty()) {
            formattedName = formattedName.substring(0, 1).toUpperCase() 
                    + formattedName.substring(1).toLowerCase();
        }
        return formattedName;
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
    
}

