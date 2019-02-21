package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupsTest {

    @Test
    public void checkEquality() {
        MyLinkedListNode n4 = new MyLinkedListNode(4, null);
        MyLinkedListNode n3 = new MyLinkedListNode(3, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);


        MyLinkedListNode m4 = new MyLinkedListNode(4, null);
        MyLinkedListNode m3 = new MyLinkedListNode(3, m4);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        assertEquals(n1.toString(), m1.toString());
    }

    @Test
    public void checkWithUnique() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);


        MyLinkedListNode m3 = new MyLinkedListNode(3, null);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        assertEquals(RemoveDups.removeDups(n1).toString(), RemoveDups.removeDups(m1).toString());
        assertEquals(RemoveDups.removeDups2(n1).toString(), RemoveDups.removeDups(m1).toString());
    }

    @Test
    public void checkWithDuplicates() {
        MyLinkedListNode n7 = new MyLinkedListNode(5, null);
        MyLinkedListNode n6 = new MyLinkedListNode(5, n7);
        MyLinkedListNode n5 = new MyLinkedListNode(4, n6);
        MyLinkedListNode n4 = new MyLinkedListNode(3, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(2, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);


        MyLinkedListNode m5 = new MyLinkedListNode(5, null);
        MyLinkedListNode m4 = new MyLinkedListNode(4, m5);
        MyLinkedListNode m3 = new MyLinkedListNode(3, m4);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        assertEquals(RemoveDups.removeDups(n1).toString(), m1.toString());
        assertEquals(RemoveDups.removeDups2(n1).toString(), m1.toString());
    }
}