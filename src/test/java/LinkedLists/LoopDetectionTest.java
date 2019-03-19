package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoopDetectionTest {

    @Test
    public void withListWithoutLoop() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        assertNull(LoopDetection.detect(n1));
    }

    @Test
    public void testWithLoop_FromListHead() {
        MyLinkedListNode n5 = new MyLinkedListNode(5, null);
        MyLinkedListNode n4 = new MyLinkedListNode(4, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(3, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        n5.next = n1;

        assertEquals(1, LoopDetection.detect(n1).data);
    }

    @Test
    public void testWithLoop_FromListTail() {
        MyLinkedListNode n5 = new MyLinkedListNode(5, null);
        MyLinkedListNode n4 = new MyLinkedListNode(4, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(3, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        n5.next = n5;

        assertEquals(5, LoopDetection.detect(n1).data);
    }

    @Test
    public void testWithLoop_FromListMiddle() {

        MyLinkedListNode n5 = new MyLinkedListNode(5, null);
        MyLinkedListNode n4 = new MyLinkedListNode(4, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(3, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        n5.next = n2;

        assertEquals(2, LoopDetection.detect(n1).data);
    }
}
