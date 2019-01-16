package ArraysAndStrings;

/**
 * Question 1.5
 *
 * One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 */
public class OneAway {

    public static boolean isOneEditAway(String s1, String s2)
    {
        if (Math.abs(s1.length() - s2.length()) > 2) {
            return false;
        }

        if (s1.equals(s2)) {
            return true;
        }

        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();

        int i = 0;
        int j = 0;
        int k = s1Chars.length - 1;
        int l = s2Chars.length - 1;
        int diffIndex = 0;

        //Iterate both strings from start to end
        while ((i < s1Chars.length) && (j < s2Chars.length)) {
            if (s1Chars[i] != s2Chars[j]) {
                diffIndex = i;
                //Diff found, let's iterate strings from end to start
                while ((k > 0) && (l > 0)) {
                    if (s1Chars[k] != s2Chars[l]) {
                        if (diffIndex != Math.max(k,l)) {
                            //Diff found and it is not at the same index as previous
                            return false;
                        }
                    }
                    k--;
                    l--;
                }
            }

            i++;
            j++;
        }

        return true;
    }
}
