package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Program that reverses the stored array elements.
 * 
 * @author David
 * @version 2023
 */
public class ReverseArray {
    /**
     * Drives the program.
     * @param args unused 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArr(array);

        reverseArray(array);

        System.out.println("Reversed array:");
        printArr(array);
        
        scanner.close();
    }

    /**
     * Reverses the array.
     * @param array array of integers.
     */
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }
    }

    /**
     * Swaps elements in array in index.
     * @param array array of integers.
     * @param i integer
     * @param j integer
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Prints the array elements.
     * @param array array of integers.
     */
    public static void printArr(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
