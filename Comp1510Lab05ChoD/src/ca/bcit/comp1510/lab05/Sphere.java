
package ca.bcit.comp1510.lab05;

/**
 * Sphere: Represents a sphere and radius.
 *
 * @author David Cho
 * @version 2023
 */
public class Sphere {
    
    /** x coordinate of the sphere. */
    private double coordinateX;
    
    /** y coordinate of the sphere. */
    private double coordinateY;
    
    /** z coordinate of the sphere. */
    private double coordinateZ;
    
    /** radius of the sphere. */
    private double radius;

    /** Constructor for sphere.
     *  @param coordinateX 
     *          double for x coordinate
     *  @param coordinateY
     *          double for y coordinate
     *  @param coordinateZ
     *          double for z coordinate
     *  @param radius
     *          double for radius
     */
    public Sphere(double coordinateX, double coordinateY, 
            double coordinateZ, double radius) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.radius = radius;
    }

    /**
     * Returns the x coordinate as a double.
     * @return the coordinateX
     */
    public double getCoordinateX() {
        return coordinateX;
    }

    /**
     * Mutates the x coordinate.
     * @param coordinateX the coordinateX to set
     */
    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    /**
     * Returns the y coordinate as a double.
     * @return the coordinateY
     */
    public double getCoordinateY() {
        return coordinateY;
    }

    /**
     * Mutates the y coordinate.
     * @param coordinateY the coordinateY to set
     */
    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    /**
     * Returns the z coordinate as a double.
     * @return the coordinateZ
     */
    public double getCoordinateZ() {
        return coordinateZ;
    }

    /**
     * Mutates the z coordinate.
     * @param coordinateZ the coordinateZ to set
     */
    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    /**
     * Returns the radius as a double.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Mutates the radius. 
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * Returns the surface area of sphere as a double.
     * @return the value of surface area as a double
     */    
    public double surfaceArea() {
        final double four = 4.0;
        final int power = 2;
        return four * Math.PI * Math.pow(radius, power);
    }

    /**
     * Returns the volume of sphere as a double.
     * @return the value of volume as a double
     */    
    public double volume() {
        final double four = 4.0;
        final double three = 3.0;
        final int power = 3;
        return (four / three) * Math.PI * Math.pow(radius, power);
    }

    @Override
    public String toString() {
        return "Sphere [coordinateX=" + coordinateX + ", coordinateY=" 
                + coordinateY + ", coordinateZ=" + coordinateZ
                + ", radius=" + radius + "]";
    }
    
}

