package ca.bcit.comp1510.lab11;

/**
 * Represents Transaction and its cart, total price, and item count. 
 * 
 * @author David
 * @version 2023
 */
public class Transaction {
    /** cart as Item array. */
    private Item[] cart;
    
    /** totalPrice as double. */
    private double totalPrice;
    
    /** itemCount as integer. */
    private int itemCount;

    /**
     * Constructs a Transaction object with cart, totalPrice, and itemCount.
     * 
     * @param size size in integer
     */
    public Transaction(int size) {
        cart = new Item[size];
        totalPrice = 0;
        itemCount = 0;
    }

    /**
     * Adds Item to cart.
     * 
     * @param name name
     * @param price price
     * @param quantity quantity
     */
    public void addToCart(String name, double price, int quantity) {
        addToCart(new Item(name, price, quantity));
    }

    /**
     * Adds Item to cart with conditions.
     * 
     * @param item item object
     */
    public void addToCart(Item item) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount++] = item;
        totalPrice += item.getPrice() * item.getQuantity();
    }

    /**
     * Increase cart size.
     * 
     */
    public void increaseSize() {
        final int three = 3;
        Item[] newCart = new Item[cart.length + three];
        System.arraycopy(cart, 0, newCart, 0, cart.length);
        cart = newCart;
    }

    /**
     * Returns total price.
     * 
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Returns total price.
     * 
     * @return totalPrice
     */
    public int getCount() {
        int count = 0;
        for (Item item : cart) {
            if (item != null) {
                count += item.getQuantity();
            }
        }
        return count;
    }

    /**
     * Returns as string.
     * 
     * @return string
     */
    @Override
    public String toString() {
        StringBuilder stringBuild = new StringBuilder();
        for (Item item : cart) {
            if (item != null) {
                stringBuild.append(item).append("\n");
            }
        }
        stringBuild.append("Total price: $").append(totalPrice);
        return stringBuild.toString();
    }
}
