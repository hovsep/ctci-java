package ArraysAndStrings;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Question 1.4
 *
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of
 * a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome does not need to be limited to just
 * dictionary words.
 */
public class PalindromePermutation {

    public static boolean isPalindromePermutation(String s)
    {
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();

        if (chars.length < 2) {
            return true;
        }

        for (char c : chars) {

            if ((c + "").matches("[^A-Za-z0-9]")) {
                continue;
            }

            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        if (charCounts.size() == 1) {
            return true;
        }

        Iterator it =  charCounts.entrySet().iterator();


        boolean centerFound = false;
        Map.Entry pair;
        while (it.hasNext()) {
            pair = (Map.Entry) it.next();

            if ((Integer) pair.getValue() % 2 != 0) {
                if (centerFound) {
                    return false;
                } else {
                    centerFound = true;
                }
            }
        }



        return true;
    }

}
