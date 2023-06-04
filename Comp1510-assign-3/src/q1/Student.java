package q1;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e & David
 * @author BCIT
 * @version 2017 & 2023
 */
public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** Test scores of students, up to three tests. */
    private int[] testScores;

    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param test1Score a testScore object containing test scores
     * @param test2Score a testScore object containing test scores
     * @param test3Score a testScore object containing test scores
     */
    public Student(String first, String last, Address home, 
            Address school, int test1Score, int test2Score, int test3Score) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        testScores = new int[] {test1Score, test2Score, test3Score};
    }


    /**
     * Constructs a Student object 
     * with default values (all test scores set to 0).
     * 
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     */
    public Student(String first, String last, Address home, Address school) {
        this(first, last, home, school, 0, 0, 0);
    }
    
    /**
     * Sets the score for the specified test number (1 through 3).
     * 
     * @param testNumber an integer representing the test number (1 through 3)
     * @param score an integer representing the score for the test
     */
    public void setTestScore(int testNumber, int score) {
        final int three = 3;
        if (testNumber >= 1 && testNumber <= three) {
            testScores[testNumber - 1] = score;
        }
    }
    
    /**
     * Returns the score for the specified test number (1 through 3).
     * 
     * @param testNumber an integer representing the test number (1 through 3)
     * @return an integer representing the score for the test
     */
    public int getTestScore(int testNumber) {
        final int three = 3;
        if (testNumber >= 1 && testNumber <= three) {
            return testScores[testNumber - 1];
        } else {
            return -1; 
        }
    }
    
    /**
     * Computes and returns the average test score for this Student object.
     * 
     * @return a double representing the average test score
     */
    public double average() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        return (double) sum / testScores.length;
    }
    
    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result = "\nName: " + firstName + " " + lastName + "\n";
        result += "Home Address: " + homeAddress + "\n";
        result += "School Address: " + schoolAddress + "\n";
        result += "Test Scores: ";
        for (int i = 0; i < testScores.length; i++) {
            result += "Test " + (i + 1) + ": " + testScores[i] + " ";
        }
        result += "\nAverage: " + average();

        return result;
    }

}

