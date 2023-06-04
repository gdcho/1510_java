package q1;

/**
 * Driver class for Course and Student;
 * prints out the averages for students in the course.
 *
 * @author David
 * @version 2023
 */
public class TestCourse {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int randomscore1 = 89;
        final int randomscore2 = 79;
        final int randomscore3 = 94;
        final int randomscore4 = 100;
        final int randomscore5 = 75;
        final int randomscore6 = 88;
        final int randomscore7 = 95;
        final int randomscore8 = 64;
        
        Course course = new Course("COMP 1510");

        Student student1 = new Student("David", "Cho", 
                new Address("586 Main Street", "Vancouver", "BC", "L3T 4T8"), 
                new Address("3770 Willingdon Ave", "Burnaby", "BC", "V5G 3H2"), 
                randomscore1, randomscore2, randomscore3);
        Student student2 = new Student("Sanghyuk", "Lee", 
                new Address("111 T1 Ave", "Burnaby", "BC", "V5F 4R2"), 
                new Address("3770 Willingdon Ave", "Burnaby", "BC", "V5G 3H2"), 
                randomscore4, randomscore4, randomscore4);
        Student student3 = new Student("Minseok", "Ryu", 
                new Address("21 Keira Blvd", "Vancouver", "BC", "V2Z 2E4"), 
                new Address("3770 Willingdon Ave", "Burnaby", "BC", "V5G 3H2"), 
                randomscore5, randomscore6, randomscore7);
        Student student4 = new Student("Heungmin", "Son", 
                new Address("321 Tottenham Way", "Vancouver", "BC", "V6B 2TG"), 
                new Address("3770 Willingdon Ave", "Burnaby", "BC", "V5G 3H2"), 
                randomscore3, randomscore8, randomscore7);
        
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        
        course.role();

        System.out.println("\nOverall course test average: " 
                + String.format("%.2f", course.average()));

    }
}


