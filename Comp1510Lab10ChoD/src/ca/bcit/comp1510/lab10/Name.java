package ca.bcit.comp1510.lab10;

import java.util.Objects;

/**
 * Represents a name object of first, middle, and last name.
 * 
 * @author David
 * @version 2023
 */
public class Name implements Comparable<Name> {
    /** String that holds first name. */
    private final String first;
    
    /** String that holds middle name. */
    private final String middle;
    
    /** String that holds last name. */
    private final String last;
    
    /**
     * Constructs a name with a first, middle, and last name.
     * @param first the first name
     * @param middle the middle name (null if none)
     * @param last the last name
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Name(String first, String middle, String last) {
        validateName(first);
        validateName(last);
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    /**
     * Constructs a name with a first and last name.
     * @param first the first name
     * @param last the last name
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Name(String first, String last) {
        this.first = first;
        this.middle = null;
        this.last = last;
    }
    
    /**
     * Validates a name parameter.
     * @param name the name to validate
     * @throws IllegalArgumentException if the name is null or empty/whitespace
     */
    private void validateName(String name) {
        Objects.requireNonNull(name, "Name cannot be null.");
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name "
            + "cannot be empty or whitespace.");
        }
    }
    
    /**
     * Returns the first name.
     * @return the first name
     */
    public String getFirst() {
        return first;
    }
    
    /**
     * Returns the middle name.
     * @return the middle name (null if none)
     */
    public String getMiddle() {
        return middle;
    }
    
    /**
     * Returns the last name.
     * @return the last name
     */
    public String getLast() {
        return last;
    }
    
    @Override
    public int compareTo(Name other) {
        int result = last.compareTo(other.last);
        if (result != 0) {
            return result;
        }
        result = first.compareTo(other.first);
        if (result != 0) {
            return result;
        }
        if (middle == null) {
            return other.middle == null ? 0 : -1;
        } else if (other.middle == null) {
            return 1;
        } else {
            return middle.compareTo(other.middle);
        }
    }
    
    @Override
    public String toString() {
        return first + (middle == null ? "" : " " + middle) + " " + last;
    }
}
