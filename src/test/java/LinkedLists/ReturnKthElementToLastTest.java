package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnKthElementToLastTest {

    @Test
    public void withOutOfScopeK() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        assertNull(ReturnKthElementToLast.kthToLast(n1, 3));
    }

    @Test
    public void withZero() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        assertEquals(3, ReturnKthElementToLast.kthToLast(n1, 0).data);
    }

    @Test
    public void withNoneZero() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        assertEquals(2, ReturnKthElementToLast.kthToLast(n1, 1).data);
    }
}