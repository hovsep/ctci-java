package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteMiddleNodeTest {

    @Test
    public void withMiddleNode() {
        MyLinkedListNode n4 = new MyLinkedListNode(4, null);
        MyLinkedListNode n3 = new MyLinkedListNode(3, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m3 = new MyLinkedListNode(4, null);
        MyLinkedListNode m2 = new MyLinkedListNode(3, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        DeleteMiddleNode.deleteMiddleNode(n2);

        assertEquals(n1.toString(), m1.toString());
    }

}