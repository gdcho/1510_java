package lab4;


/**
 * Demonstrates the creation and use of a user-defined class.
 * 
 * @author David & Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class RollingMultiDice {
    /**
     * Driver program creates two Die objects and rolls them.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        
        int sum;
        final int maxInt = 50;
        final int minInt = 2;
        
        //Generates two random integers 
        int random1 = (int) (Math.random() * maxInt + minInt);
        int random2 = (int) (Math.random() * maxInt + minInt);

        //Random integers are called into the MultiDie class
        MultiDie die1 = new MultiDie(random1);
        MultiDie die2 = new MultiDie(random2);
        
        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2 + "\n");

        //Die1 and die2 gets a face value
        System.out.println("Die 1 face value: " + die1.getFaceValue() 
                            + "\nDie 2 face value: " + die2.getFaceValue());
        
        //Sum of the dice facevalues
        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum of face values: " + sum + "\n");

        /*
         * Die1 and Die2 are called by the roll public class 
         * and prints the values and sum.
         */
        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
        
    }
}

