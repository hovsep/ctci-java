package LinkedLists;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 2.6
 *
 * Palindrome: Implement a function to check if a linked list is a palindrome
 */
public class Palindrome {

    /**
     * Bruteforce approach - copy to array and then check
     * requires additional O(n) space
     *
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome(MyLinkedListNode head)
    {
        List<Integer> a = new ArrayList<Integer>();
        MyLinkedListNode current = head;

        while (null != current) {

            a.add(current.data);

            current = current.next;
        }

        int len = a.size()-1;
        int i = 0;
        int j = len;

        while (i <= j) {

            if (!a.get(i).equals(a.get(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
