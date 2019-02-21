package LinkedLists;

import java.util.HashSet;

/**
 * Question 2.1
 *
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class RemoveDups {

    /**
     * Uses O(n) additional space
     *
     * @param head
     * @return
     */
    public static MyLinkedListNode removeDups(MyLinkedListNode head)
    {
        MyLinkedListNode n = head;
        MyLinkedListNode previous = n;
        HashSet items = new HashSet<Integer>();

        do {
            if (items.contains(n.data)) {
                //remove item from list
                previous.next = n.next;
            } else {
                //add to hash map
                items.add(n.data);
            }

            previous = n;
            n = n.next;

            if (null == n) {
                break;
            }

        } while (true);


        return head;
    }
}
