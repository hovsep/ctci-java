package LinkedLists;

/**
 * Question 2.8
 *
 * Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
 * beginning of the loop
 */
public class LoopDetection {

    public static MyLinkedListNode detect(MyLinkedListNode head)
    {
        MyLinkedListNode fast = head;
        MyLinkedListNode slow = head;

        while ((null != fast) && (null != fast.next)) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow.equals(fast)) {
                break;
            }
        }

        if ((null == fast) || (null == fast.next)) {
            return null;
        }

        slow = head;

        while (!slow.equals(fast)) {
           slow = slow.next;
           fast = fast.next;
        }

        return fast;
    }
}
