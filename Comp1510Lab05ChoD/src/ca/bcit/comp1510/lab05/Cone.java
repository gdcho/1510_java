
package ca.bcit.comp1510.lab05;

/**
 * Cone: Represents a cone and values.
 *
 * @author David Cho
 * @version 2023
 */
public class Cone {
    
    /** Represents the radius as a double. */
    private double radius;
    
    /** Represents the height as a double. */
    private double height;

    /** Constructor for Cone.
     * @param radius
     *      double for radius.
     * @param height
     *      double for height.
     */
    public Cone(double radius, double height) {
        super();
        this.radius = radius;
        this.height = height;
    }

    /**
     * Returns radius as double.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Mutates radius.
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns height as double.
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Mutates height.
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Returns the volume as a double.
     * @return the value of volume as a double
     */ 
    public double volume() {
        final double one = 1.0;
        final double three = 3.0;
        final int power = 2;
        return (one / three) * Math.PI * Math.pow(radius, power) * height;
    }
     
    /**
     * Returns the slant height as a double.
     * @return the value of slant height as a double
     */ 
    public double slantHeight() {
        final int power = 2;
        return Math.sqrt(Math.pow(radius, power) + Math.pow(height, power));
    }
    
    /**
     * Returns the surface area as a double.
     * @return the value of surface area as a double
     */ 
    public double surfaceArea() {
        final int power = 2;
        return Math.PI * Math.pow(radius, power)
                + Math.PI * radius * Math.sqrt(Math.pow(radius, power) 
                + Math.pow(height, power));
    }

    @Override
    public String toString() {
        return "Cone [radius=" + radius + ", height=" + height + "]";
    }
    
    
}
