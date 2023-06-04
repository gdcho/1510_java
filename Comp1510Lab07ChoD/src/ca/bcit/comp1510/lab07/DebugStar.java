package ca.bcit.comp1510.lab07;

/** 
 * DebugStar
 *
 * This programs adds, subtracts, and finds the factorial.
 *
 * @author David Cho
 * @version 2023
 *
 */
public class DebugStar {
    
    /** 
     * Runs three arguments.
     * @param args unused
     */
    public static void main(String[] args) {
        final int six = 6;
        final int seven = 7;
        
        run("+", six, seven);
        run("-", six, seven);
        run(six);
    }
    
    private static Operation getOperation(final String key) {
        final Operation operation;
        if (key.equals("+")) {
            operation = new Add();
        } else {
            operation = new Subtract();
        }
        return operation;
    }
    
    private static void run(final String key, final int a, final int b) {
        final Operation operation = getOperation(key);
        final int result = operation.perform(a, b);
        System.out.println("result = " + result);
    }
    
    private static void run(final int n) {
        final Factorial factorial = new Factorial();
        final int result = factorial.perform(n);
        System.out.println("result = " + result);
    }

}

interface Operation {
    int perform(int a, int b);
}

class Add implements Operation {
    @Override
    public int perform(final int a, final int b) {
        return (a + b);
    }
}

class Subtract implements Operation {
    @Override
    public int perform(final int a, final int b) {
        return (a - b);
    }
}

class Factorial {
    static int perform(final int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return (ret);
    }
}

