
package lab4;

/**
 * Student: Represent the name, birth year, number, and gpa of a student.
 * 
 * @author David
 * @version 2022
 *
 */
public class Student {
    
    /*** Private string for first name.*/
    private String firstName;
    
    /*** Private string for last name.*/
    private String lastName;
    
    /*** Private integer for birth year.*/
    private int birthYear;
    
    /*** Private string for student number.*/
    private String studentNumber;
    
    /*** Private string for gpa.*/
    private int gPa;
    
    /**
     * Constructor for first names, last name, 
     * birth year, student number, and gpa.
     * 
     * @param first first name
     * @param last last name
     * @param birth birth year
     * @param string student number
     * @param grade gpa
     */
    public Student(String first, String last, 
            int birth, String string, int grade) {
        firstName = first;
        lastName = last;
        birthYear = birth;
        studentNumber = string;
        gPa = grade;
    }
    
    /**
     * Returns the first name as a string.
     * @return firstName as a String
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns the last name as a string.
     * @return lastName as a String
     */
    public String getLastName() {
        return lastName;
    }  

    /**
     * Returns the birth year as a integer.
     * @return birthYear as an int
     */
    public int getbirthYear() {
        return birthYear;
    }  

    /**
     * Returns the student number as a string.
     * @return studentNumber as a String
     */
    public String getStudentNumber() {
        return studentNumber;
    }  

    /**
     * Returns the gpa as a double.
     * @return gPa as an int
     */
    public int getGradeAverage() {
        return gPa;
    }  
        
    /**
     * Mutates the first name.
     * @param name firstName
     */
    public void setFirstName(String name) {
        firstName = name;
    }     

    /**
     * Mutates the last name.
     * @param name lastName
     */
    public void setLastName(String name) {
        lastName = name;
    } 

    /**
     * Changes the birth year.
     * @param year birthYear
     */
    public void setbirthYear(int year) {
        birthYear = year;
    } 

    /**
     * Mutates the student number.
     * @param number studentNumber
     */
    public void setStudentNumber(String number) {
        studentNumber = number;
    } 

    /**
     * Changes the grade average.
     * @param grades gPa
     */
    public void setGradeAverage(int grades) {
        gPa = grades;
    } 
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + birthYear
                + " " + studentNumber + " " + gPa;
        
    }
}
