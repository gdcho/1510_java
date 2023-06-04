/**
 * 
 */
package comp1510tut;

/**
 * @author David
 *
 */
public class IntegerWrapper {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer myInt = 5; //object not primitive data type
        Double myDouble = 5.8;
        Character myChar = 'a';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        int i = myInt;
        // int [] nums = new int [10]; // array with ten spaces
        // Arraylist <Integer> can only take objects not primitive types
        // numlist = new Arraylist<>();
        System.out.println(i);
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(Integer.toBinaryString(myInt));
        String s = myInt.toString();
        System.out.println(myInt.toString());
        System.out.println(s.length());
        
        //String to int
        String s1 = "123";
        String s2 = "56";
        String s3 = "123.52";
        String s4 = "a12"; //not possible to convert to integer or double
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        double z = Double.parseDouble(s1);
        double result = x + y + z;
        System.out.println(result);
    }

}

// 1. Wrapper classes
// 2. Classes and Objects

//private attribute
//public attribute

//Employee class
// -name
// -id
// -job title
// -age
// -salary