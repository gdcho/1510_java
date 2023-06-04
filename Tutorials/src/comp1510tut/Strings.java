package comp1510tut;

import java.util.Scanner;
import java.util.Random;

public class Strings {
    
    public static void main(String[] args) { 
       
        int v1=5, v2=10;

        boolean done = true;
        
        System.out.println((!(v1<v2) || done ));
        
        String s = "Hello World";
        
        
        System.out.println(s.startsWith("He"));
        System.out.println(s.substring(10,11));
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.contains("llo"));
        System.out.println(s.indexOf("Wor"));
        
        
        Random ran = new Random();
        int nxt = ran.nextInt(6) +1;
        System.out.println(nxt);
        
        for (int i=0; i<5; i++) {
            System.out.println((int)(1 + Math.random() * 6));
       
        
        // static = method is associated with class, NOT instance
            
        // Constructor does not have return statements but is a pointer
        }
    }

}
