package q3;

import java.util.Scanner;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class TestMIXChar {
    
    private static final char DELTA = '\u0394';
    private static final char SIGMA = '\u03A3';
    private static final char PI = '\u03A0';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MIX characters: ");
        String input = scanner.nextLine();
        scanner.close();

        // Check if input contains valid MIX characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!(MIXChar.isMIXChar(c) || c == DELTA 
                    || c == SIGMA || c == PI)) {
                System.err.println("Invalid MIX character: " + c);
                return;
            }
        }

        // Encode input into a Message and print encoded long array
        Message message = new Message(input);
        String encodedLongs = message.toLongs();
        System.out.println("Encoded longs: " + encodedLongs);

        // Decode the Message and print the resulting Java string
        Message decodedMessage = new Message(message.toString());
        String decodedString = decodedMessage.toString();
        System.out.println("Decoded string: " + decodedString);
    }
}

