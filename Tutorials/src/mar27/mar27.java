package mar27;

public class mar27 {

    public static void main (String[] args) {
        System.out.println(3.0 == 0.0 * (3.0 / 0.0));
    }

     

    public static void addFivePoints(int[] arrayName)

    {

        for (int i = 0; i < arrayName.length; i++)

        {

            arrayName[i] += 5;

        }

    }
	
	//Abstract method -- method that doesnt have body to allow polymorphism
	//Method overloading -- two methods with same name with different parameters (formal parameters/signatures)
	//Signature allows for method overloading (data type, order, number of input params)
	//Return type is not part of signature
	//Method overriding - inherit a method and override it
	
	//Interface - allows for consistency, polymorphism, abstract methods
	//Can implement more than one interface
	
	//"this"? - this object or current object; usually used to distinguish current object or another object
	// that is passed as a parameter (use this whenever you can)
	
	//aggregation - these items make up the whole
	
	//iterable vs iterator (iterable contains the iterator)
	//iterable is the list you can iterate (actual list you can go through)
}
