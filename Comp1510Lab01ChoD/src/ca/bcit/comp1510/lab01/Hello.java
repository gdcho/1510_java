/**
 * 
 */

package ca.bcit.comp1510.lab01;

/**
 * Prints Hello World.
 * 
 * @author David Cho
 * @version 2023
 *
 */
public class Hello {

    /**
     * Prints the greeting.
     * 
     * @param args
     *      unused
     */
    public static void main(String[] args) {
        System.out.println("Hello World");

    }
    
    /**
     * Class name different from file name. Delete one l (el) from the name of the class
     * a. Error: Could not find or load main class ca.bcit.comp1510.lab01.Hello in module Comp1510Lab01ChoD
     * 
     * b. There are no errors but the system prints into the console Helo World instead of Hello World
     * 
     * No ending quotation mark in a string literal.
     * c. Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
     *          Hello cannot be resolved to a variable Syntax error on token "World", delete this token at 
     *          Comp1510Lab01ChoD/ca.bcit.comp1510.lab01.Hello.main(Hello.java:20)
     * 
     * No beginning quotation mark in a string literal
     * d. Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
     *          Syntax error on token(s), misplaced construct(s) Syntax error, insert ";" to complete BlockStatements 
     *          String literal is not properly closed by a double-quote String literal is 
     *          not properly closed by a double-quote
     *          at Comp1510Lab01ChoD/ca.bcit.comp1510.lab01.Hello.main(Hello.java:20)
     * 
     * No semicolon after a statement.
     * e. Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
     *          Syntax error, insert ";" to complete BlockStatements
     *          at Comp1510Lab01ChoD/ca.bcit.comp1510.lab01.Hello.main(Hello.java:20)
    */

}


