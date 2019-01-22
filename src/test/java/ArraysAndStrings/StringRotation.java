package ArraysAndStrings;

/**
 * Question 1.9
 *
 * String Rotation: Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of" erbottlewat")
 */
public class StringRotation {

    public static boolean rotated(String s1, String s2)
    {
        return (s2 + s2).indexOf(s1) != -1;
    }
}
