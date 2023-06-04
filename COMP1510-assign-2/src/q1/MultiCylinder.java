package q1;

/**
 * Driver class for Cylinder.
 *
 * @author David
 * @version 2023
 */
public class MultiCylinder {
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        final int three = 3;
        final int four = 4;
        final int five = 5;
        
        //Cylinder(double radius, double height)
        Cylinder cylinder1 = new Cylinder(2, four);
        Cylinder cylinder2 = new Cylinder(1, 2);

        System.out.println("Cylinder 1 before modification: " + cylinder1 
                + "/nCylinder 2 before modification: " + cylinder2);

        cylinder1.setRadius(three);
        cylinder1.setHeight(five);
        cylinder2.setRadius(2);
        cylinder2.setHeight(four);

        System.out.println("Cylinder 1 after modification: " + cylinder1);
        System.out.println("Cylinder 2 after modification: " + cylinder2);

        System.out.println("Cylinder 1 volume: " + cylinder1.volume() 
                + "\nCylinder 1 surface area: " + cylinder1.surfaceArea() 
                + "\nCylinder 2 volume: " + cylinder2.volume() 
                + "\nCylinder 2 surface area: " + cylinder2.surfaceArea());
    }

}
