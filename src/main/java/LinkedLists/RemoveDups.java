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

    public static void main(String[] args) {
        MyLinkedListNode n8 = new MyLinkedListNode(6, null);
        MyLinkedListNode n7 = new MyLinkedListNode(6, n8);
        MyLinkedListNode n6 = new MyLinkedListNode(5, n7);
        MyLinkedListNode n5 = new MyLinkedListNode(4, n6);
        MyLinkedListNode n4 = new MyLinkedListNode(4, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(3, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(3, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        System.out.println("Before: " + n1.toString());
        System.out.println("After:  " + RemoveDups.removeDups2(n1).toString());
    }

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

    /**
     * In place algorithm
     * No additional space required
     *
     * @param head
     * @return
     */
    public static MyLinkedListNode removeDups2(MyLinkedListNode head)
    {
        MyLinkedListNode current = head;
        MyLinkedListNode runner;

        while (null != current) {
            runner = current.next;

            while (null != runner) {

                if (current.data == runner.data) {
                    current.next = runner.next;
                    break;
                }

                runner = runner.next;
            }

            current = current.next;
        }

        return head;
    }
}
