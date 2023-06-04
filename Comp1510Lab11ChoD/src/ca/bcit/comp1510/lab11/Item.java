
package ca.bcit.comp1510.lab11;

/**
 * Represents Items and its name, price, and quantity. 
 * 
 * @author David
 * @version 2023
 */
public class Item {
    /** Name as string. */
    private final String name;
    
    /** Price as double. */
    private final double price;
    
    /** Quantity as integer. */
    private final int quantity;

    /**
     * Constructs a Item object with name, price, and quantity.
     * 
     * @param name name
     * @param price price
     * @param quantity quantity 
     */
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * Constructs a Item object with name and price.
     * 
     * @param name name
     * @param price price
     */
    public Item(String name, double price) {
        this(name, price, 1);
    }

    /**
     * Getter for name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for price.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Getter for quantity.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Returns string representation.
     * 
     * @return string 
     */
    @Override
    public String toString() {
        return name + " (" + quantity + ") - $" + price;
    }
}
