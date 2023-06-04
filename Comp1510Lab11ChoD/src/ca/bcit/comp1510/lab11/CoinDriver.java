package ca.bcit.comp1510.lab11;

/**
 * Driver class for the Coin class.
 * 
 * @author David
 * @version 2023
 */
public class CoinDriver {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        System.out.println("Initial coin face: " + coin);

        coin.setKey(1);
        coin.lock(1);

        if (coin.locked()) {
            System.out.println("Coin is now locked.\n");
        } else {
            System.out.println("Coin is now unlocked.\n");
        }

        coin.flip();
        System.out.println("Locked coin after flip: " + coin);

        coin.unlock(1);

        if (coin.locked()) {
            System.out.println("Coin is now locked.\n");
        } else {
            System.out.println("Coin is now unlocked.\n");
        }

        coin.flip();
        System.out.println("Unlocked coin after flip: " + coin);
    }
}
