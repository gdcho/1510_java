package ca.bcit.comp1510.lab10;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Driver class for Name.
 * 
 * @author David
 * @version 2023
 */
public class NameDriver {

    /** 
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<Name> names = new ArrayList<>();
        names.add(new Name("Sangheok", "Lee"));
        names.add(new Name("David", "Cho"));
        names.add(new Name("Gun-Hee", "David", "Cho"));
        names.add(new Name("Jihoon", "Lee"));
        names.add(new Name("Minhyung", "Gumayusi", "Lee"));
        names.add(new Name("Heungmin", "Sonny", "Son"));
        names.add(new Name("Minjae", "KimKimKim", "Kim"));
        names.add(new Name("Minseok", "Keria", "Ryu"));
        
        System.out.println("Before sorting:");
        for (Name name : names) {
            System.out.println(name);
        }
        
        Collections.sort(names);
        
        System.out.println("\nAfter sorting:");
        for (Name name : names) {
            System.out.println(name);
        }
    }
}
