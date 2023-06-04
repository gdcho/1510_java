package q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Calculates and prints the number of 
 * primes integers and values in an upper bound.
 *
 * @author David
 * @version 2023
 */
public class Primes {
    
    /** Constant for primes as list. */
    private List<Boolean> primes;
    
    /**
     * Constructs prime object and integer 
     * prime value to be calculated.
     * @param prime int
     */
    public Primes(int prime) {
        primes = new ArrayList<Boolean>();
        for (int i = 0; i <= prime; i++) {
            primes.add(true);
        }
        calculatePrimes(prime);
    }

    /**
     * Set prime if int is greater or 
     * equal to 2.
     * @param prime int
     */
    private void calculatePrimes(int prime) {
        primes.set(0, false);
        primes.set(1, false);
        for (int i = 2; i <= Math.sqrt(prime); i++) {
            if (primes.get(i)) {
                for (int j = i * i; j <= prime; j += i) {
                    primes.set(j, false);
                }
            }
        }
    }

    /**
     * Print the prime numbers.
     */
    public void printPrimes() {
        System.out.print("The prime numbers are: ");
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Count the prime numbers.
     * @return count int
     */
    public int countPrimes() {
        int count = 0;
        for (int i = 0; i < primes.size(); i++) {
            if (primes.get(i)) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Determine if int is prime.
     * @param x int
     * @return primes.get(x)
     */
    public boolean isPrime(int x) {
        if (x < 0 || x >= primes.size()) {
            throw new IllegalArgumentException("x must be in the range [0, N]");
        }
        return primes.get(x);
    }

    /**
     * Drives the program.
     * @param args uused
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTh;
        do {
            System.out.println("Enter an upper bound greater than 1:");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid. Enter a number");
                scanner.next();
            }
            nTh = scanner.nextInt();
        } while (nTh <= 1);

        Primes primes = new Primes(nTh);
        System.out.println("There are " + primes.countPrimes() + " primes:");
        primes.printPrimes();
        scanner.close();
    }
}
