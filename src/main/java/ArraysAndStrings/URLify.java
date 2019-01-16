package ArraysAndStrings;

/**
 * Question 1.3
 *
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: if implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 */
public class URLify {

    /**
     * Brute force solution
     */
    public static char[] urlify(char[] input, int l)
    {
        char currentChar;

        for (int i = 0; i < input.length; i++) {
            currentChar = input[i];

            if (currentChar == ' ') {
                //Shift rest string
                for (int j = l - 1; j > i; j--) {
                    input[j+2] = input[j];
                }

                input[i] = "%".charAt(0);
                input[i+1] = "2".charAt(0);
                input[i+2] = "0".charAt(0);
                l += 2;
            }
        }

        return input;
    }

}
