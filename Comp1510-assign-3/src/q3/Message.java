package q3;

/**
 * This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author David
 * @version 2023
 */
public class Message {
    private final long[] data;
    private final int count;

    public Message(MIXChar[] m) {
        count = m.length;
        int longsNeeded = (count + 10) / 11;
        data = new long[longsNeeded];

        for (int i = 0; i < count; i++) {
            int longIndex = i / 11;
            data[longIndex] = data[longIndex] * 56 + m[i].ordinal();
        }
    }

    public Message(String s) {
        this(MIXChar.toMIXChar(s));
    }

    public String toString() {
        MIXChar[] mixChars = new MIXChar[count];
        for (int i = 0, j = 0; i < data.length; i++) {
            long currentLong = data[i];
            for (int k = 0; k < 11 && j < count; k++, j++) {
                mixChars[j] = new MIXChar(MIXChar.MIX_CHARS[(int) 
                                                      (currentLong % 56)]);
                currentLong /= 56;
            }
        }
        return MIXChar.toString(mixChars);
    }

    public String toLongs() {
        StringBuilder sb = new StringBuilder();
        for (long l : data) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(Long.toUnsignedString(l));
        }
        return sb.toString();
    }
}
