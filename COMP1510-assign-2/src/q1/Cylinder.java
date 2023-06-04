package q1;

/**
 * A class representing a cylinder object.
 * 
 * @author David
 * @version 2023
*/
public class Cylinder {
    
    /** Constant for radius. */
    private double radius;
    
    /** Constant for radius. */
    private double height;

    /**
     * Constructs a new Cylinder object with the radius and height.
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /**
     * Getter for radius.
     * @return radius as double
     */
    public double getRadius() {
        return radius;
    }
    
    /**
     * Getter for height.
     * @return height as double
     */
    public double getHeight() {
        return height;
    }

    /**
     * Setter for radius.
     * @param radius new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Setter for height.
     * @param height new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates volume.
     * @return volume as double
     */
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    
    /**
     * Calculates surface area.
     * @return surface area as double
     */
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    /**
     * Returns a string.
     * @return string
     */
    public String toString() {
        return "\nRadius: " + radius + "\nHeight: " + height;
    }
}

