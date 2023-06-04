package ca.bcit.comp1510.lab09;


import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

/**
 * Test cases for the Complex class.
 * 
 * @author [your name]
 * @version [date]
 */
public class ComplexTest {

    @Test
    public void testAdd() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex expected = new Complex(4, 6);
        Complex actual = c1.add(c2);
        Assertions.assertEquals(expected, actual, "Addition is incorrect");
    }

    @Test
    public void testSubtract() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex expected = new Complex(-2, -2);
        Complex actual = c1.subtract(c2);
        Assertions.assertEquals(expected, actual, "Subtraction is incorrect");
    }

    @Test
    public void testMultiply() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex expected = new Complex(-5, 10);
        Complex actual = c1.multiply(c2);
        Assertions.assertEquals(expected, actual, "Multiplication is incorrect");
    }

    @Test
    public void testDivide() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex expected = new Complex(0.44, 0.08);
        Complex actual = c1.divide(c2);
        double tolerance = 0.01;
        Assertions.assertEquals(expected.re, actual.re, tolerance, "Real part of division is incorrect");
        Assertions.assertEquals(expected.im, actual.im, tolerance, "Imaginary part of division is incorrect");
    }

    @Test
    public void testEquals() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(1, 2);
        Assertions.assertEquals(c1, c2, "Equals method is incorrect");
    }
    
    @Test
    public void testEquals2() {
        Complex z1 = new Complex(1, 2);
        Complex z2 = new Complex(1, 2);
        Complex z3 = new Complex(3, 4);

        assertTrue(z1.equals(z2)); // should be equal
        assertFalse(z1.equals(z3)); // should not be equal
    }

    @Test
    public void testHashCode() {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(1, 2);
        Assertions.assertEquals(c1.hashCode(), c2.hashCode(), "HashCode is incorrect");
    }
}
   