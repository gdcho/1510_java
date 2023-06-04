
package ca.bcit.comp1510.lab05;

/**
 * Sphere: Represents a cube and values.
 *
 * @author David Cho
 * @version 2023
 */
public class Cube {
    
    /** Represents the x coordinate of cube. */
    private double coordinateX;
    
    /** Represents the y coordinate of cube. */
    private double coordinateY;
    
    /** Represents the z coordinate of cube. */
    private double coordinateZ;
    
    /** Represents the edge length of cube. */
    private double edgeLength;

    /** Constructor for Cube.
     * @param coordinateX
     *      double for x coordinate
     * @param coordinateY
     *      double for y coordinate
     * @param coordinateZ
     *      double for z coordinate
     * @param edgeLength
     *      double for edge length
     */
    public Cube(double coordinateX, double coordinateY, 
            double coordinateZ, double edgeLength) {
        super();
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.edgeLength = edgeLength;
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
     * Muatates the y coordinate. 
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
     * Returns the edge length as a double.
     * @return the edgeLength
     */
    public double getEdgeLength() {
        return edgeLength;
    }

    /**
     * Mutates the edge length.
     * @param edgeLength the edgeLength to set
     */
    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public String toString() {
        return "Cube [coordinateX=" + coordinateX + ", coordinateY=" 
                + coordinateY + ", coordinateZ=" + coordinateZ
                + ", edgeLength=" + edgeLength + "]";
    }
    
    /**
     * Returns the surface area as a double.
     * @return the value of surface area as a double
     */ 
    public double surfaceArea() {
        final double six = 6.0;
        final int power = 2;
        return six * Math.pow(edgeLength, power);
    }
    
    /**
     * Returns the volume as a double.
     * @return the value of volume as a double
     */ 
    public double volume() {
        final int power = 3;
        return Math.pow(edgeLength, power);
    }
    
    /**
     * Returns the face diagonal as a double.
     * @return the value of face diagonal as a double
     */ 
    public double faceDiagonal() {
        final double twoSquared = Math.sqrt(2);
        return  twoSquared * edgeLength;
    }

    /**
     * Returns the space diagonal as a double.
     * @return the value of space diagonal as a double
     */ 
    public double spaceDiagonal() {
        final double threeSquared = Math.sqrt(3);
        return threeSquared * edgeLength;
    }
    
    
    
    
}
