package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumListTest {

    @Test
    void sumReverseWithNoCarry() {
        MyLinkedListNode n3 = new MyLinkedListNode(6, null);
        MyLinkedListNode n2 = new MyLinkedListNode(4, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(2, n2);

        MyLinkedListNode m3 = new MyLinkedListNode(3, null);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        MyLinkedListNode k3 = new MyLinkedListNode(3, null);
        MyLinkedListNode k2 = new MyLinkedListNode(2, k3);
        MyLinkedListNode k1 = new MyLinkedListNode(1, k2);

        assertEquals(n1.toString(), SumList.sumReverse(m1, k1).toString());
    }

    @Test
    void sumReverseWithCarry() {
        MyLinkedListNode n3 = new MyLinkedListNode(1, null);
        MyLinkedListNode n2 = new MyLinkedListNode(0, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(0, n2);

        MyLinkedListNode m1 = new MyLinkedListNode(1, null);

        MyLinkedListNode k2 = new MyLinkedListNode(9, null);
        MyLinkedListNode k1 = new MyLinkedListNode(9, k2);

        assertEquals(n1.toString(), SumList.sumReverse(m1, k1).toString());
    }

    @Test
    void sumForwardWithNoCarry() {
        MyLinkedListNode n3 = new MyLinkedListNode(6, null);
        MyLinkedListNode n2 = new MyLinkedListNode(4, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(2, n2);

        MyLinkedListNode m3 = new MyLinkedListNode(3, null);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        MyLinkedListNode k3 = new MyLinkedListNode(3, null);
        MyLinkedListNode k2 = new MyLinkedListNode(2, k3);
        MyLinkedListNode k1 = new MyLinkedListNode(1, k2);

        assertEquals(n1.toString(), SumList.sumForward(m1, k1).toString());
    }

    @Test
    void sumForwardWithCarry() {
        MyLinkedListNode n3 = new MyLinkedListNode(0, null);
        MyLinkedListNode n2 = new MyLinkedListNode(0, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m1 = new MyLinkedListNode(1, null);

        MyLinkedListNode k2 = new MyLinkedListNode(9, null);
        MyLinkedListNode k1 = new MyLinkedListNode(9, k2);

        assertEquals(n1.toString(), SumList.sumForward(m1, k1).toString());
    }
}