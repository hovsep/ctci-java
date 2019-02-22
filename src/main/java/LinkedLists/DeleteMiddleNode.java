package LinkedLists;

/**
 * Question 2.3
 * Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.EXAMPLE
 * input:the node c from the linked list a->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 *
 */
public class DeleteMiddleNode {

    /**
     * Brutforce solution
     *
     * @param nodeToDelete
     */
    public static void deleteMiddleNode(MyLinkedListNode nodeToDelete)
    {
        MyLinkedListNode current = nodeToDelete;

        while (null != current.next) {
            current.data = current.next.data;

            if (current.next.next == null) {
                current.next = null;
                break;
            }
            current = current.next;
        }

    }

    public static void deleteMiddleNode2(MyLinkedListNode nodeToDelete)
    {
        if (null != nodeToDelete.next) {

            MyLinkedListNode next = nodeToDelete.next;

            //Copy data from next
            nodeToDelete.data = next.data;
            nodeToDelete.next = next.next;
        }
    }
}
