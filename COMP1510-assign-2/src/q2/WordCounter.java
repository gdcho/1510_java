package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class that counts the word in bible.txt.
 *
 * @author David
 * @version 2023
 */
public class WordCounter {

    /** Constant for word list. */
    private List<Word> words;

    /**
     * Word object with word and frequency.
     */
    public WordCounter() {
        words = new ArrayList<Word>();
    }
    
    /**
     * Parses through file and finds unique words.
     * @param fileName input
     * @return uniqueWords as int
     */
    public int parseBook(String fileName) throws FileNotFoundException {
        File file = new File("src/" + fileName);
        Scanner scanner = new Scanner(file);

        int uniqueWords = 0;

        while (scanner.hasNext()) {
            String wordString = 
                    scanner.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

            Word word = findWord(wordString);
            if (word == null) {
                word = new Word(wordString);
                words.add(word);
                uniqueWords++;
            } else {
                word.incrementFrequency();
            }
        }

        scanner.close();

        return uniqueWords;
    }
    
    /**
     * Prints the top unique words.
     * @param n integer value
     */
    public void printTopWords(int n) {
        words.sort(null);

        for (int i = 0; i < n && i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }

    /**
     * Finds word for duplicates.
     * @param wordString string value 
     * @return word or null
     */
    private Word findWord(String wordString) {
        for (Word word : words) {
            if (word.getWord().equals(wordString)) {
                return word;
            }
        }
        return null;
    }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) throws FileNotFoundException {
        final int ten = 10;
        WordCounter wordCounter = new WordCounter();
        int uniqueWords = wordCounter.parseBook("bible.txt");
        System.out.println("Number of unique words: " + uniqueWords);
        System.out.println("Top 10 most frequent words:");
        wordCounter.printTopWords(ten);
    }
    
}
