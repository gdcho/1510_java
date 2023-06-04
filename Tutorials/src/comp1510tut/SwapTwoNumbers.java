package comp1510tut;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter two integers to swap: ");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        System.out.println("Numbers before swapping: a= " + a + " b= " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swapping: a= " + a + " b= " + b);
        

    }

}
