package q2;

/**
 * Word class that implements Comparable.
 * 
 * @author David
 * @version 2023
*/
public class Word implements Comparable<Word> {
    
    /** Constant for word. */
    private final String word;
    
    /** Constant for frequency. */
    private int frequency;

    /**
     * Word object with word and frequency.
     * @param word word
     */
    public Word(String word) {
        this.word = word;
        this.frequency = 1;
    }

    /**
     * Getter for word.
     * @return word as String
     */
    public String getWord() {
        return word;
    }

    /**
     * Calculates frequency.
     * @return frequency as int
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Increments frequency.
     */
    public void incrementFrequency() {
        frequency++;
    }

    /**
     * Returns a string.
     * @return string
     */
    @Override
    public String toString() {
        return word + " (" + frequency + ")";
    }

    /**
     * Compares strings by frequency.
     * @param other compares Word and other
     * @return int
     */
    public int compareTo(Word other) {
        if (this.frequency > other.frequency) {
            return -1;
        } else if (this.frequency < other.frequency) {
            return 1;
        } else {
            return this.word.compareTo(other.word);
        }
    }
}
