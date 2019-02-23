package LinkedLists;

/**
 * Question 2.4
 *
 * Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. If x is contained within the list the values of x only need
 * to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input: 3->5->8->5->10->2->1 [partition= 5]
 * Output: 3->1->2->10->5->5->8
 */
public class Partition {


    /**
     * Debug
     * @param args
     */
    public static void main(String[] args) {
        MyLinkedListNode n7 = new MyLinkedListNode(1, null);
        MyLinkedListNode n6 = new MyLinkedListNode(2, n7);
        MyLinkedListNode n5 = new MyLinkedListNode(10, n6);
        MyLinkedListNode n4 = new MyLinkedListNode(5, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(8, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(5, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(3, n2);

        System.out.println(Partition.partition(n1, 5));
    }

    /**
     * My solution
     *
     * @param head
     * @param p
     * @return
     */
    public static MyLinkedListNode partition(MyLinkedListNode head, int p)
    {
        MyLinkedListNode current = head;
        MyLinkedListNode previous = null;

        while (null != current) {

            if ((current.data < p) && (null != previous)) {
                previous.next = current.next;
                current.next = head;
                head = current;
                current = previous.next;
            } else {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }


    /**
     * huiwang solution
     *
     * @param head
     * @param x
     * @return
     */
    public static MyLinkedListNode partition3(MyLinkedListNode head, int x)
    {
        MyLinkedListNode pre = null;
        MyLinkedListNode cur = head;

        while (null != cur) {
            if (cur.data < x && pre != null) {
                pre.next = cur.next;
                cur.next = head;
                head = cur;
                cur = pre.next;
            } else {
                pre = cur;
                cur = cur.next;
            }

        }
        return head;
    }

    /**
     *
     * Solution from book
     *
     * @param node
     * @param p
     * @return
     */
    public static MyLinkedListNode partition2(MyLinkedListNode node, int p)
    {
        MyLinkedListNode head = node;
        MyLinkedListNode tail = node;

        while(node != null) {
            MyLinkedListNode next = node.next;
            if (node.data < p) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }

            node = next;
        }
        tail.next = null;

        return head;
    }
}
