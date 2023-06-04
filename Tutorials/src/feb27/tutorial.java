package feb27;

public class tutorial {

    
    public static void main(String[] args) {
        // Constructor overloading - different parameters in constructor and runs depending on type of parameter
        //   depends on how many parameters in the constructor
        
        //parameters:
        // actual (before method call a = 10 b = 20)
        // 200
        // formal (after method call a = 10 b = 20)
        
        System.out.println(3.0 == 0.0 * (3.0 / 0.0));
    }
    
//    public static void max(int x, int y) {
//        x = 100;
//        y = 200;
//        if (x>y) {
//            System.out.println(x);
//        }
//        else {
//            System.out.println(y);
//        }
//    }
    
    public static int max(int x, int y) {
        return Math.max(x,y);
    }
    
    public static int max(int x, int y, int z) {
        test();
        return Math.max(Math.max(x,y), z);
    }
    
    public static double max(double num1, double num2) {
        return Math.max(num1, num2);
    }
    
    public static void test() {
        System.out.println("hi");
    }
    
}
