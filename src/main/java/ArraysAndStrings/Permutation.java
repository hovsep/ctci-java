package ArraysAndStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Question 1.2
 *
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */
public class Permutation {

    /**
     * Brute force solution
     */
    public static boolean isPermutation(String s1, String s2)
    {
        HashMap<Character, Integer> s1CharactersCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> s2CharactersCount = new HashMap<Character, Integer>();

        for (int i = 0; i < s1.toCharArray().length; i++)
        {
            if (s1CharactersCount.containsKey(s1.charAt(i))) {
                s1CharactersCount.put(s1.charAt(i), s1CharactersCount.get(s1.charAt(i)) + 1);
            } else {
                s1CharactersCount.put(s1.charAt(i), 1);
            }
        }


        for (int i = 0; i < s2.toCharArray().length; i++)
        {
            if (s2CharactersCount.containsKey(s2.charAt(i))) {
                s2CharactersCount.put(s2.charAt(i), s2CharactersCount.get(s2.charAt(i)) + 1);
            } else {
                s2CharactersCount.put(s2.charAt(i), 1);
            }
        }


        Iterator it1 = s1CharactersCount.entrySet().iterator();
        Iterator it2 = s2CharactersCount.entrySet().iterator();

        while (it1.hasNext()) {
            Map.Entry pair = (Map.Entry) it1.next();
            if (!s2CharactersCount.containsKey(pair.getKey()) || s2CharactersCount.get(pair.getKey()) != s1CharactersCount.get(pair.getKey())) {
                return false;
            }
        }

        while (it2.hasNext()) {
            Map.Entry pair = (Map.Entry) it2.next();
            if (!s1CharactersCount.containsKey(pair.getKey()) || s1CharactersCount.get(pair.getKey()) != s2CharactersCount.get(pair.getKey())) {
                return false;
            }
        }

        return true;
    }
}
