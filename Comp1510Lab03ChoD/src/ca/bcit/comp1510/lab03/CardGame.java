/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * CardGame: Returns the enumeration of card number to rank.
 * 
 * @author David
 * @version 2022
 *
 */
public class CardGame {
    /**
     * Enumerated type rank.
     *
     */
    enum Rank { 
        /** ace to five. */
        ace, two, three, four, five,
                        
        /** six to ten. */
        six, seven, eight, nine, ten,
                
        /** jack, queen, and king. */
        jack, queen, king
    }
    
    /**
     * Enumerated type Suit.
     *
     */
    enum Suit { 
        /** hearts, diamonds, clubs, and spades. */
        hearts, diamonds, clubs, spades;
    }
    
    /**
     * Drives the program.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        
        Random generator = new Random();
        
        int randomRankChoice = generator.nextInt(Rank.values().length);
        int randomSuitChoice = generator.nextInt(Suit.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.println("Your random rank number is: " + randomRankChoice);
        System.out.println("Your random suit number is: " + randomSuitChoice);
        System.out.println("Your random card is: \"" + randomRank 
                            + " of " + randomSuit + "\"");
        
    }

}
