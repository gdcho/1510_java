package feb27;
import java.util.ArrayList;

public class Methods {
    
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(1, 15);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        numList.add(50);
        numList.add(60);
        System.out.println(numList);
        testArrayList(numList);
        System.out.println(numList);
        
    }
    
    public static void testArrayList(ArrayList<Integer> list) {
        list.set(0,100);
        // will reference to same memory location to numList (list is now an alias of numList)
    }
}
