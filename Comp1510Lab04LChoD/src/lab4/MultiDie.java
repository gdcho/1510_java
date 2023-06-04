
package lab4;

/**
 * Represents multiple dice with faces showing values between 1 and 6.
 * 
 * @author David & Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class MultiDie {
    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;
    
    /**
     * Constructor sets the initial face value.
     * 
     * @param numSides description
     */
    public MultiDie(int numSides) {
        max = numSides;
        faceValue = roll();
    }

    /**
     * Rolls this Die and returns the result.
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
    
    /*
     *1. We do not need setters or getters for max since max is 
     *      utilized in the public class roll which returns as
     *      faceValue to public class MultiDie.
     *2. Yes, we can get getters and setters for max.
     *3. It makes sense for max to be final since the value of max
     *      will not change as it is called to other public classes in the
     *      main class.
     *4. For max being final, it shows that the value of max will not be changed
     *      during the when the program is driven. The value of max is 
     *      restricted to change.
     *5. Yes, max is an instance variable.
     * 
     */
}

