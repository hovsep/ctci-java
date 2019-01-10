package ArraysAndStrings;

import java.util.*;

/**
 * Question 1.1
 *
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 *
 *
 */
public class UniqueChars {

    /**
     * 128 - ASCII
     * 1103 - ASCII + Cyrillic
     */
    private static final int MAX_CHAR_CODE = 128;


    /**
     * Uses array as additional storage
     *
     * ASCII only
     *
     * @param str String to be checked
     */
    public static boolean isUniqueChars(String str)
    {
        if (str.length() == 0) {
            return true;
        }

        char[] used = new char[MAX_CHAR_CODE];

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == used[str.charAt(i)]) {
                return false;
            }

            used[str.charAt(i)] = str.charAt(i);
        }

        return true;
    }

    /**
     * Uses Hashmap as additional storage
     *
     * @param str String to be checked
     */
    public static boolean isUniqueChars2(String str)
    {
        if (str.length() == 0) {
            return true;
        }

        if (str.length() > MAX_CHAR_CODE) {
            return false;
        }

        HashMap<Character, Character> used = new HashMap<Character, Character>();

        for (int i = 0; i < str.length(); i++) {

            if (used.containsValue(str.charAt(i)) && str.charAt(i) == used.get(str.charAt(i))) {
                return false;
            }

            used.put(str.charAt(i), str.charAt(i));
        }

        return true;
    }

    /**
     *
     * Doesn't use additional storage
     *
     * @param str String to be checked
     */
    public static boolean isUniqueChars3(String str)
    {
        if (str.length() == 0) {
            return true;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if ((i != j) && (str.charAt(i) == str.charAt(j))) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Uses Set as additional storage
     *
     *
     * @param str String to be checked
     */
    public static boolean isUniqueChars4(String str)
    {
        if (str.length() == 0) {
            return true;
        }

        Set<Character> used = new HashSet<Character>();

        for (Character c : str.toCharArray()) {
            used.add(c);
        }

        return (used.size() == str.length());
    }

}
