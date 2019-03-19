package LinkedLists;

/**
 *
 * Question 2.7
 *
 * Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the
 * intersecting node. Note that the intersection is defined based on reference, not value. That is, if the
 * kth node of the first linked list is the exact same node (by reference) as the jth node of the second
 * linked list, then they are intersecting
 *
 */
public class Intersection {

    /**
     *
     * Bruteforce approach with O(n*m) runtime
     *
     * @param head1
     * @param head2
     * @return
     */
    public static boolean intersects(MyLinkedListNode head1, MyLinkedListNode head2)
    {
        MyLinkedListNode r1 = head1;
        MyLinkedListNode r2;

        while (null != r1) {
            r2 = head2;
            while (null != r2) {

                if (r1.equals(r2)) {
                    //r1 is intersection node
                    return true;
                }

                r2 = r2.next;
            }
            r1 = r1.next;
        }

        return false;
    }
}
