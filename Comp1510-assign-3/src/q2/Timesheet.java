package q2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.>
 *
 * @author David
 * @version 2023
 */
public class Timesheet {
    /** Employee number as String. */
    private String empNum;
    
    /** End date as LocalDate. */
    private LocalDate endWeek;
    
    /** List of TimesheetRow objects. */
    private List<TimesheetRow> details;

    /**
     * No argument constructor
     * for Timesheet class.
     */
    public Timesheet() {
        this.details = new ArrayList<>();
    }

    /**
     * Constructs a Timesheet
     * with employee number, end date.
     * 
     * @param empNum the employee number for this timesheet
     * @param endWeek the end date for this timesheet (must be a Friday)
     */
    public Timesheet(String empNum, LocalDate endWeek) {
        this.empNum = empNum;
        setEndWeek(endWeek);
        this.details = new ArrayList<>();
    }
    
    /**
     * Getter for employee number.
     * @return empNum employee number
     */
    public String getEmpNum() {
        return empNum;
    }
    
    /**
     * Setter for employee number.
     * @param empNum employee number
     */
    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    /**
     * Getter for end week.
     * @return endWeek end of the week
     */
    public LocalDate getEndWeek() {
        return endWeek;
    }

    /**
     * Setter for end week.
     * @param endWeek end of the week
     */
    public void setEndWeek(LocalDate endWeek) {
        if (endWeek == null || endWeek.getDayOfWeek() != DayOfWeek.FRIDAY) {
            throw new IllegalArgumentException("The end date must be a Friday");
        }
        this.endWeek = endWeek;
    }

    /**
     * Getter for TimesheetRow list.
     * @return details list details
     */
    public List<TimesheetRow> getDetails() {
        return details;
    }

    /**
     * Setter for TimesheetRow list.
     * @param details list details
     */
    public void setDetails(List<TimesheetRow> details) {
        this.details = details;
    }

    /**
     * Adds a new row to the timesheet.
     * @param row the TimesheetRow object
     */
    public void addRow(TimesheetRow row) {
        details.add(row);
    }
    
    /**
     * Returns a string representation of timesheet.
     * @return a string representation of timesheet
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee Number: ").append(empNum).append("\n");
        sb.append("End Week: ").append(endWeek).append("\n");
        sb.append("Details: \n");
        for (TimesheetRow row : details) {
            sb.append(row).append("\n");
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Timesheet timesheet = new Timesheet("E12345", LocalDate.of(2023, 4, 7));
        timesheet.addRow(new TimesheetRow(1, "WP1", 
                3.2f, 1.1f, 4.5f, 5.5f, 3.2f, 2.0f, 5.0f));
        timesheet.addRow(new TimesheetRow(2, "WP2", 
                4.0f, 3.5f, 2.5f, 1.5f, 6.2f, 7.0f, 3.0f));
        timesheet.addRow(new TimesheetRow(3, "WP3", 
                2.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f));

        System.out.println(timesheet);
    }
    
}
