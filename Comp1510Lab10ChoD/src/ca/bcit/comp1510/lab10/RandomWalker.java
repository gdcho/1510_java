package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * Represents a RandomWalker object that walks 
 * and its attributes are measured.
 * 
 * @author David
 * @version 2023
 */
public class RandomWalker {
    /** integer that holds x. */
    private int x;
    
    /** integer that holds y. */
    private int y;
    
    /** integer that holds maximum steps. */
    private int maxSteps;
    
    /** integer that holds the amount of steps taken. */
    private int stepsTaken;
    
    /** integer that holds the boundary. */
    private int boundary;
    
    /** integer that holds the maximum distance. */
    private int maximumDistance;

    /**
     * Constructs a walker with max steps and boundary.
     * @param maxSteps the maximum amount of steps
     * @param boundary the boundary
     */
    public RandomWalker(int maxSteps, int boundary) {
        this.maxSteps = maxSteps;
        this.boundary = boundary;
        this.x = 0;
        this.y = 0;
        this.maximumDistance = 0;
    }

    /**
     * Constructs a walker with max steps x, y, and boundary.
     * @param maxSteps the maximum amount of steps
     * @param x x value
     * @param y y value
     * @param boundary the boundary
     */
    public RandomWalker(int maxSteps, int x, int y, int boundary) {
        this.maxSteps = maxSteps;
        this.x = x;
        this.y = y;
        this.boundary = boundary;
        this.stepsTaken = 0;
        this.maximumDistance = 0;
    }

    /**
     * Returns the stepsTaken in string.
     * @return stepsTaken 
     */
    public String toString() {
        return "RandomWalker is at (" + x + ", " + y 
                + ") after " + stepsTaken + " steps.";
    }

    /**
     * takeStep method that simulates steps. 
     */
    public void takeStep() {
        final int three = 3;
        final int four = 4;
        Random rand = new Random();
        int direction = rand.nextInt(four);

        switch (direction) {
            case 0:
                y += 1;
                break;
            case 1:
                y -= 1;
                break;
            case 2:
                x += 1;
                break;
            case three:
                x -= 1;
                break;
            default:
                break;
        }

        stepsTaken++;

        int distance = max(Math.abs(x), Math.abs(y));
        maximumDistance = max(maximumDistance, distance);
    }

    /**
     * moreSteps method which returns boolean value
     * when comparing stepsTaken and maxSteps.
     * 
     * @return boolean true or false
     */
    public boolean moreSteps() {
        return stepsTaken < maxSteps;
    }

    /**
     * inBounds method which returns boolean value
     * when comparing the boundary.
     * 
     * @return boolean true or false
     */
    public boolean inBounds() {
        return Math.abs(x) <= boundary && Math.abs(y) <= boundary;
    }

    /**
     * walk method which calls the takeStep method
     * while moreSteps and inBounds equal true.
     * 
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    /**
     * Accessor for x.
     * @return x the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Accessor for y.
     * @return y the y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Accessor for max steps.
     * @return maxSteps the max amount of steps
     */
    public int getMaxSteps() {
        return maxSteps;
    }

    /**
     * Accessor for steps taken.
     * @return stepsTaken the amount of steps taken
     */
    public int getStepsTaken() {
        return stepsTaken;
    }

    /**
     * Accessor for boundary.
     * @return boundary the step boundary
     */
    public int getBoundary() {
        return boundary;
    }

    /**
     * Accessor for the maximum distance.
     * @return maximumDistance the max distance
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }

    /**
     * Private method for returning the max value.
     * 
     * @param a int a
     * @param b int b
     * @return a : b
     */
    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
