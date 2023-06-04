package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * Driver class for Item and Transaction.
 * 
 * @author David
 * @version 2023
 */
public class Shopping {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Transaction transaction = new Transaction(1);
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        final int three = 3;
        final int four = 4;

        while (!done) {
            System.out.println("1. Add item by details"
                    + "\n2. Add item by object"
                    + "\n3. Show cart"
                    + "\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("\nEnter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("\nEnter item quantity: ");
                    int quantity = scanner.nextInt();
                    transaction.addToCart(name, price, quantity);
                    break;
                case 2:
                    System.out.print("\nEnter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("\nEnter item price: ");
                    double itemPrice = scanner.nextDouble();
                    Item item = new Item(itemName, itemPrice);
                    transaction.addToCart(item);
                    break;
                case three:
                    System.out.println("\nCart:\n" + transaction);
                    break;
                case four:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }

}
