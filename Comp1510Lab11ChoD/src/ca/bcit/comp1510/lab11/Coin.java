package ca.bcit.comp1510.lab11;

/**
 * Represents a two-sided coin that can be flipped and locked.
 * 
 * @author Lewis & Loftus 9e & David
 * @version 2023
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;

    /** Key for locking and unlocking the coin. */
    private int key;

    /** Indicates if the coin is locked or not. */
    private boolean isLocked;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
    }

    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public boolean lock(int keys) {
        if (this.key == keys) {
            isLocked = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean unlock(int keys) {
        if (this.key == keys) {
            isLocked = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean locked() {
        return isLocked;
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        if (!isLocked) {
            face = (int) (Math.random() * 2);
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        
        return faceName;
    }
}
