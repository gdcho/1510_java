package q3;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author David
 * @version 2023
 */
public class MIXChar {
    public static final char[] MIX_CHARS 
    = " ABCDEFGHIΔJKLMNOPQRΣΠSTUVWXY0123456789.,()+-*/=<>@;:'".
            toCharArray();
    
    private final int value;

    public MIXChar(char c) {
        int index = -1;
        for (int i = 0; i < MIX_CHARS.length; i++) {
            if (MIX_CHARS[i] == c) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException("Invalid MIX character: " + c);
        }
        value = index;
    }

    public static boolean isMIXChar(char c) {
        for (char mixChar : MIX_CHARS) {
            if (mixChar == c) {
                return true;
            }
        }
        return false;
    }

    public char toChar() {
        return MIX_CHARS[value];
    }

    public static String toString(MIXChar[] mixChars) {
        StringBuilder sb = new StringBuilder();
        for (MIXChar mixChar : mixChars) {
            sb.append(mixChar.toChar());
        }
        return sb.toString();
    }

    public static MIXChar[] toMIXChar(String s){
        MIXChar[] mixChars = new MIXChar[s.length()];
        for (int i = 0; i < s.length(); i++) {
            mixChars[i] = new MIXChar(s.charAt(i));
        }
        return mixChars;
    }

    public int ordinal() {
        return value;
    }

    public String toString() {
        return String.valueOf(toChar());
    }
}

