package q4;

/**
 * Calculates the exponential values for 
 * a given value.
 *
 * @author David
 * @version 2023
 */
public class Exponential {
    
    /** Constant for max iterations. */
    public static final int MAX_ITERATION = 1000;
    
    /** Constant for epsilon. */
    public static final double EPSILON = 1e-15;
        
    /**
     * Exp method that uses x as double
     * and iteratively calculates the term of 
     * the series until the max term or when the value
     * becomes less than the threshold epsilon.
     * 
     * @param x value as double
     * @return sum of the iterations
     */
    public static double exp(double x) {
        double sum = 1.0;
        double term = 1.0;
        int value = 1;

        while (value < MAX_ITERATION && Math.abs(term) > EPSILON) {
            term *= x / value;
            sum += term;
            value++;
        }

        return sum;
    }

    /**
     * Drives the program.
     * @param args uused
     */
    public static void main(String[] args) {
        
        final double negTen = -10.0;
        final int twenty = 20;
        double x = negTen;
        double increment = 1.0;

        System.out.println("x\t\te^x");
        for (int i = 0; i <= twenty; i++) {
            double result = exp(x);
            System.out.printf("%.1f\t\t%.10f\n", x, result);
            x += increment;
        }
    }
}
