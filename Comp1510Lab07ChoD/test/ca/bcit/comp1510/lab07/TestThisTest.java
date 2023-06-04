package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestThisTest {
    
    /**
     * The TestThis object to test.
     */
    private TestThis test = new TestThis();
    
    /**
     * The List Integers list to test.
     */
    private List<Integer> list = new ArrayList<>();
    
    /**
     * Tests testLargestIntIntInt1 to get the largest integer value.
     */
    @Test
    public void testLargestIntIntInt1() {
        assertEquals(5, test.largest(4, 5, 3));
    }
    
    /**
     * Tests testLargestIntIntInt2 to get the largest integer value.
     */
    @Test
    public void testLargestIntIntInt2() {
        assertEquals(-1, test.largest(-1, -6, -3));
    }

    /**
     * Tests testLargestIntIntInt3 to get the largest integer value.
     */
    @Test
    public void testLargestIntIntInt3() {
        assertEquals(0, test.largest(0, 0, 0));
    }

    /**
     * Tests testLargestListOfInteger1 
     *  to get the largest integer value from array list.
     */
    @Test
    public void testLargestListOfInteger1() {
        list = Arrays.asList(4, 5, 3);
        assertEquals(5, test.largest(list));
    }

    /**
     * Tests testLargestListOfInteger2
     *  to get the largest integer value from array list.
     */
    @Test
    public void testLargestListOfInteger2() {
        list = Arrays.asList(-1, -6, -3);
        assertEquals(-1, test.largest(list));
    }

    /**
     * Tests testLargestListOfInteger3
     *  to get the largest integer value from array list.
     */
    @Test
    public void testLargestListOfInteger3() {
        list = Arrays.asList(0, 0, 0);
        assertEquals(0, test.largest(list));
    }

}
