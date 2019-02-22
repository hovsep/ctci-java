package LinkedLists;

/**
 * Question 2.2 Implement an algorithm to find the kth to last element of a singly linked list
 */
public class ReturnKthElementToLast {


    public static MyLinkedListNode kthToLast(MyLinkedListNode head, int k)
    {
        int size = 1;
        int i = 1;
        MyLinkedListNode current = head;

        //Traverse the list to define its size

        while (current.next != null) {
            size++;
            current = current.next;
        }

        if (k >= size) {
            //Out of size
            return null;
        }

        //Reset iterator
        current = head;

        //Iterate and find kth
        while (i != (size - k)) {
            current = current.next;
            i++;
        }

        return current;
    }
}
