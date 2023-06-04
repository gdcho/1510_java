package comp1510tut;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a 4 digit integer: ");
        int num = myScanner.nextInt();
        int sum = 0;
        int rem = num % 10;
        sum = sum + rem;
        num = num / 10;
        rem = num % 10;
        sum = sum + rem;
        num = num / 10;
        rem = num % 10;
        sum = sum + rem;
        num = num / 10;
        rem = num % 10;
        sum = sum + rem;
        
        System.out.println("The sum of the digits is: " + sum);
        myScanner.close();
        
        // int rem = 0;
        // while (num != 0){
        //  rem = num % 10;
        //  sum += rem;
        //  num /= 10;
        //{
    }

}
