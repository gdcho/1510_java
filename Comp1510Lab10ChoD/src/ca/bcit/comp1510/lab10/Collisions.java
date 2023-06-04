package ca.bcit.comp1510.lab10;

/**
 * Driver class for RandomWalker
 * that simulates a collision 
 * if occupied on the same coordinates.
 * 
 * @author David
 * @version 2023
 */
public class Collisions {
    /** 
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final int boundary = 2000000;
        final int steps = 100000;
        final int three = 3;
        
        RandomWalker particle1 = new RandomWalker(steps, boundary, -three, 0);
        RandomWalker particle2 = new RandomWalker(steps, boundary, three, 0);

        int numCollisions = 0;
        for (int i = 0; i < steps; i++) {
            particle1.takeStep();
            particle2.takeStep();
            if (samePosition(particle1, particle2)) {
                numCollisions++;
            }
        }

        System.out.println("Number of collisions: " + numCollisions);
        System.out.println("Farthest distance a particle gets: " 
                + maxDistance(particle1, particle2));
    }

    /**
     * samePosition method which returns boolean
     * value depending on whether the two RandomWalker
     * objects occupy the same position.
     * 
     * @param one RandomWalker object one
     * @param two RandomWalker object two
     * @return boolean 
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        return one.getX() == two.getX() && one.getY() == two.getY();
    }

    /**
     * maxDistance method which returns an integer value
     * which represents the distance between the two
     * RandomWalker objects.
     * 
     * @param one RandomWalker object one
     * @param two RandomWalker object two
     * @return integer value 
     */
    public static int maxDistance(RandomWalker one, RandomWalker two) {
        int xDiff = Math.abs(one.getX() - two.getX());
        int yDiff = Math.abs(one.getY() - two.getY());
        return Math.max(xDiff, yDiff);
    }
}
