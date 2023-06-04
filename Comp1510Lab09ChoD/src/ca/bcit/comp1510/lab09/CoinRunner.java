package ca.bcit.comp1510.lab09;

/**
 * Tests the Coin class by creating a Coin 
 * and flip it 100 times,
 * then determining the longest run of heads.
 * 
 * @author David
 * @version 2023
 */
public class CoinRunner {
    
    /**
     * Runs the program.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        Coin coin = new Coin();
        final int hundred = 100;
        int longestRun = 0;
        int run = 0;
        
        for (int i = 0; i < hundred; i++) {
            coin.flip();
            System.out.println(coin);
            
            if (coin.isHeads()) {
                run++;
                if (run > longestRun) {
                    longestRun = run;
                }
            } else {
                run = 0;
            }
        }
        
        System.out.println("The longest run of heads is: " + longestRun);
    }
}
