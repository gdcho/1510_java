package ca.bcit.comp1510.lab08;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateTest {
    
    /** Test for IllegalArgumentException.*/
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        new Date(33, 4, 2022);
    }
    
    /** Test for Valid Constructor.*/
    @Test
    public void validConstructor() {
        new Date(30, 4, 2022);
    }
    
    /** Test for isMonthValid().*/
    @Test
    public void testIsMonthValid() {
        assertTrue(Date.isMonthValid(1));
        assertTrue(Date.isMonthValid(6));
        assertTrue(Date.isMonthValid(12));
    }
    
    /** Test for isMonthValid().*/
    @Test
    public void testIsMonthValidWithInvalidMonth() {
        assertFalse(Date.isMonthValid(0));
        assertFalse(Date.isMonthValid(13));
        assertFalse(Date.isMonthValid(-1));
    }

    /** Test for leapYear().*/
    @Test
    public void testLeapYear() {
        assertTrue(Date.isLeapYear(2000));
        assertTrue(Date.isLeapYear(2004));
        assertTrue(Date.isLeapYear(2020));
        assertFalse(Date.isLeapYear(1900));
        assertFalse(Date.isLeapYear(2003));
        assertFalse(Date.isLeapYear(2100));
    }
    
    /** Test for isYearValid().*/
    @Test
    public void testIsYearValid() {
        assertTrue(Date.isYearValid(1600));
        assertTrue(Date.isYearValid(2020));
        assertTrue(Date.isYearValid(2999));
        assertFalse(Date.isYearValid(1000));
        assertFalse(Date.isYearValid(1581));
        assertFalse(Date.isYearValid(3000));
    }
    
    /** Test for daysInMonth().*/
    @Test
    public void testDaysInMonth() {
        assertEquals(31, Date.daysInMonth(1, false));
        assertEquals(28, Date.daysInMonth(2, false));
        assertEquals(29, Date.daysInMonth(2, true));
        assertEquals(31, Date.daysInMonth(3, false));
        assertEquals(30, Date.daysInMonth(4, false));
        assertEquals(31, Date.daysInMonth(5, false));
        assertEquals(30, Date.daysInMonth(6, false));
        assertEquals(31, Date.daysInMonth(7, false));
        assertEquals(31, Date.daysInMonth(8, false));
        assertEquals(30, Date.daysInMonth(9, false));
        assertEquals(31, Date.daysInMonth(10, false));
        assertEquals(30, Date.daysInMonth(11, false));
        assertEquals(31, Date.daysInMonth(12, false));
        assertEquals(0, Date.daysInMonth(13, false));
    }
    
    /** Test for isDateValid().*/
    @Test
    public void testIsDateValid() {
        assertTrue(Date.isDateValid(1, 1, 1600));
        assertTrue(Date.isDateValid(29, 2, 1600));
        assertFalse(Date.isDateValid(30, 2, 1600));
        assertTrue(Date.isDateValid(31, 3, 1600));
        assertTrue(Date.isDateValid(30, 9, 1600));
        assertFalse(Date.isDateValid(31, 11, 1600));
        
        assertTrue(Date.isDateValid(24, 2, 1582));
        assertFalse(Date.isDateValid(23, 1, 1582));
        assertFalse(Date.isDateValid(23, 1, 1580));
        assertFalse(Date.isDateValid(23, 2, 1582));
        assertTrue(Date.isDateValid(28, 2, 1582));
        assertTrue(Date.isDateValid(23, 3, 1580));
        
        assertTrue(Date.isDateValid(1, 1, 1750));
        assertTrue(Date.isDateValid(31, 8, 1750));
        assertTrue(Date.isDateValid(30, 9, 1750));
        assertTrue(Date.isDateValid(31, 12, 1750));
        assertFalse(Date.isDateValid(0, 1, 1750));
        assertFalse(Date.isDateValid(32, 1, 1750));
        assertFalse(Date.isDateValid(31, 11, 1750));
        
        assertTrue(Date.isDateValid(1, 1, 2020));
        assertTrue(Date.isDateValid(29, 2, 2020));
        assertFalse(Date.isDateValid(30, 2, 2020));
        assertTrue(Date.isDateValid(31, 3, 2020));
        assertTrue(Date.isDateValid(30, 4, 2020));
        assertTrue(Date.isDateValid(31, 5, 2020));
    }
    
}
