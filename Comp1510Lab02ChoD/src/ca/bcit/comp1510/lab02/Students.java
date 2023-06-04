package ca.bcit.comp1510.lab02;

/**
 * Students: Prints a table with a list of students and their grades.
 *
 * @author David
 * @version 2022
 *
 */
public class Students {
    
    /**
     * Drives the program.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        
        System.out.println("///////////////////"
                            + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n"
                            + "==\tStudent Points\t    ==\n" 
                            + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                            + "///////////////////\n"
                            + "Name\tLab\tBonus\tTotal\n"
                            + "----\t---\t-----\t----\n"
                            + "Joe\t43\t7\t" + (43 + 7) + "\n"
                            + "William\t50\t8\t" + (50 + 8) + "\n"
                            + "Mary Sue\t39\t10\t" + (30 + 10) + "\n"
                            + "Peng\t87\t6\t" + (9 + 3) + "\n"
                            + "Kwon\t99\t0\t" + (99 + 0) + "\n");

    }

}
