package ca.bcit.comp1510.lab08;

import java.util.Scanner;


/**
 * Represent a valid Gregorian date on or after 24 February 1582.
 * @author David
 * @version 2023
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    /**
     * Constructs Date object with day, month, and year as integers.
     * 
     * @param theDay  day
     * @param theMonth  month
     * @param theYear  year
     * @throws IllegalArgumentException if the date is not valid
     */
    public Date(int theDay, int theMonth, int theYear) {
        if (!isDateValid(theDay, theMonth, theYear)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.day = theDay;
        this.month = theMonth;
        this.year = theYear;
    }
    
    /**
     * Checks if month is valid.
     * 
     * @param m  month
     * @return boolean value
     */
    public static boolean isMonthValid(int m) {
        final int twelve = 12;
        return m >= 1 && m <= twelve;
    }
    
    /**
     * Checks if year is valid.
     * 
     * @param year  year
     * @return boolean value
     */
    public static boolean isYearValid(int year) {
        final int lowerYear = 1582;
        final int higherYear = 2999;
        return year >= lowerYear && year <= higherYear;
    }
    
    /**
     * Checks for leap year.
     * 
     * @param year  year
     * @return boolean value
     */
    public static boolean isLeapYear(int year) {
        final int four = 4;
        final int hundred = 100;
        final int fourHund = 400;
        return (year % four == 0 && year % hundred != 0) 
                || (year % fourHund == 0);
    }

    /**
     * Returns the number of days in the given month for the given year.
     * 
     * @param month  month 
     * @param isLeapYear  boolean
     * @return int days in the month
     */
    public static int daysInMonth(int month, boolean isLeapYear) {
        int daysInMonth = 0;
        final int mar = 3;
        final int apr = 4;
        final int may = 5;
        final int jun = 6;
        final int jul = 7;
        final int aug = 8;
        final int sept = 9;
        final int oct = 10;
        final int nov = 11;
        final int dec = 12;
        final int twentyEight = 28;
        final int twentyNine = 29;
        final int thirty = 30;
        final int thirtyOne = 31;

        if (month == 1 || month == mar || month == may || month == jul 
                || month == aug || month == oct || month == dec) {
            daysInMonth = thirtyOne;
        } else if (month == apr || month == jun 
                || month == sept || month == nov) {
            daysInMonth = thirty;
        } else if (month == 2) {
            if (isLeapYear) {
                daysInMonth = twentyNine;
            } else {
                daysInMonth = twentyEight;
            }
        }

        return daysInMonth;
    }

    /**
     * Returns the number of days in the month of the year.
     * 
     * @param day day
     * @param month month
     * @param year year
     * @return boolean
     */
    public static boolean isDateValid(int day, int month, int year) {
        final int twentyFour = 24;
        final int two = 2;
        final int minYear = 1582;
        boolean dayValid = false;
        boolean isLeapYear = isLeapYear(year);
        int daysInMonth = daysInMonth(month, isLeapYear);
        
        if (day < twentyFour
                && month <= two
                && year <= minYear) {
            dayValid = false;
        } else if (day >= 1 && day <= daysInMonth) {
            dayValid = true;
        }
        
        return dayValid;
    }
    
    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) { 
        //date read in from user
        
        int month;
        int day;
        int year;
        //true if parts of input from user is valid
        boolean monthValid;
        boolean yearValid;
        boolean dayValid;  
        //number of days in month read in
        int daysInMonth;
        //true if user's year is a leap year
        boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        //Get integer month, day, and year from user
        System.out.print("Enter month (1-12): ");
        month = scan.nextInt();
        System.out.print("Enter day (1-31): ");
        day = scan.nextInt();
        System.out.print("Enter year (1582-2999): ");
        year = scan.nextInt();
        //Use the methods to check to see if month is valid
        monthValid = Date.isMonthValid(month);
        if (!monthValid) {
            daysInMonth = 0;
        }

        //Use the methods to check to see if year is valid
        yearValid = Date.isYearValid(year);
        //Use the methods to determine whether it's a leap year
        leapYear = Date.isLeapYear(year);
        //Use the methods to determine number of days in month
        daysInMonth = Date.daysInMonth(month, leapYear);
        //Use the methods to see if day is valid
        dayValid = day >= 1 && day <= daysInMonth;
        //Use the methods to determine whether date is valid
        if (monthValid && yearValid && dayValid 
                && isDateValid(day, month, year)) {
            //   and print appropriate message
            System.out.println("Date is valid.");
            if (leapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Date is not valid.");
            new Date(day, month, year);
        }
        scan.close();
        
        
    } 
} 
