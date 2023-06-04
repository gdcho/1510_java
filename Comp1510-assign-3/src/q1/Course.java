package q1;

/**
 * Represents a course students can take.
 * 
 * @author David
 * @author BCIT
 * @version 2023
 */
public class Course {
    /** Course name. */
    private String courseName;
    
    /** Last of students. */
    private Student[] students;
    
    /** Number of students. */
    private int numStudents;

    /**
     * Constructs a Course object with
     * students array of five students.
     * 
     * @param name course name
     */
    public Course(String name) {
        final int five = 5;
        courseName = name;
        students = new Student[five];
        numStudents = 0;
    }

    /**
     * Adds a student to this course.
     * 
     * @param student the Student object
     */
    public void addStudent(Student student) {
        final int five = 5;
        if (numStudents < five) {
            students[numStudents] = student;
            numStudents++;
        } else {
            System.out.println("No more space, the course is full.");
        }
    }

    /**
     * Returns the average test score for students in the course.
     * 
     * @return a double representing the average test score for all students
     */
    public double average() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < numStudents; i++) {
            sum += students[i].average();
            count++;
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }

    /**
     * Prints a list of all students in the course.
     */
    public void role() {
        System.out.println("Course: " + courseName);
        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i]);
        }
    }
}
