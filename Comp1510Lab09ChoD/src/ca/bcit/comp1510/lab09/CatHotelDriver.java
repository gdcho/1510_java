package ca.bcit.comp1510.lab09;


import java.util.Random;

/**
 * @author David
 * @version 2023
 *
 */
public class CatHotelDriver {

    /**
     * Creates a CatHotel object, adds 10 Cats in it,
     * and tests functions of CatHotel.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        CatHotel myCatHotel = new CatHotel("Cat Hotel");
        Random generator = new Random();
        final int catAgeLimitation = 20;
        final int catNumber = 10;
        for (int i = 1; i <= catNumber; i++) {
            Cat newCat = new Cat(
                    generator.nextInt(catAgeLimitation));
            myCatHotel.addCat(newCat);
        }
        
        System.out.println("Original list:");
        myCatHotel.printGuestList();
        System.out.println("\nRemoving older than 5:");
        final int ageLimitation = 5;
        System.out.println("Removed " 
                + myCatHotel.removeOldGuests(ageLimitation) + " cats.");
        myCatHotel.printGuestList();
        System.out.println("\nHow many cats are in the hotel?");
        System.out.println(myCatHotel.guestCount() + ".");
        System.out.println("\nClearing all cats:");
        myCatHotel.removeAllGuests();
        myCatHotel.printGuestList();
        System.out.println("\nAdding two new cats:");
        final int luckyAge = 10;
        final int moneyAge = 7;
        Cat cat1 = new Cat("Lucky", luckyAge);
        Cat cat2 = new Cat("Money", moneyAge); 
        myCatHotel.addCat(cat1);
        myCatHotel.addCat(cat2);
        myCatHotel.printGuestList();
        
        
    }

}
