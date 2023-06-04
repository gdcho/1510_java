package ca.bcit.comp1510.lab11;

/**
 * Lockable interface for Coin class.
 * 
 * @author David
 * @version 2023
 */
public interface Lockable {
    /**
     * Key used to unlock.
     * @param key key
     */
    void setKey(int key);
    
    /**
     * Boolean to see if key is locked.
     * @param key lock
     * @return boolean value
     */
    boolean lock(int key);
    
    /**
     * Boolean to see if key is unlocked.
     * @param key lock
     * @return boolean value
     */
    boolean unlock(int key);
    
    /**
     * Boolean to see if implementing
     * object is locked.
     * @return boolean value
     */
    boolean locked();
}
