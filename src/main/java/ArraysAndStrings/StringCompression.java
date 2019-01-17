package ArraysAndStrings;

/**
 * Question 1.6
 *
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 *
 */
public class StringCompression {


    public static String compress(String s)
    {
        char[] chars = s.toCharArray();
        StringBuilder compressed = new StringBuilder();

        int charCounter = 1;
        char currentChar = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                charCounter++;
            } else {
                compressed.append(currentChar).append(charCounter);
                charCounter = 1;
                currentChar = chars[i];
            }
        }

        //Add last char
        compressed.append(currentChar).append(charCounter);

        return (compressed.toString().length() < s.length()) ? compressed.toString() : s;
    }
}
