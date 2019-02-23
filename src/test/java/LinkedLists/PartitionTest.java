package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionTest {

    @Test
    public void withSortedList() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m3 = new MyLinkedListNode(3, null);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        assertEquals(n1.toString(), Partition.partition(m1, 2).toString());
    }

    @Test
    public void fromBook() {
        MyLinkedListNode n7 = new MyLinkedListNode(1, null);
        MyLinkedListNode n6 = new MyLinkedListNode(2, n7);
        MyLinkedListNode n5 = new MyLinkedListNode(10, n6);
        MyLinkedListNode n4 = new MyLinkedListNode(5, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(8, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(5, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(3, n2);

        MyLinkedListNode m7 = new MyLinkedListNode(10, null);
        MyLinkedListNode m6 = new MyLinkedListNode(5, m7);
        MyLinkedListNode m5 = new MyLinkedListNode(8, m6);
        MyLinkedListNode m4 = new MyLinkedListNode(5, m5);
        MyLinkedListNode m3 = new MyLinkedListNode(3, m4);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);


        assertEquals(m1.toString(), Partition.partition(n1, 5).toString());
    }

    @Test
    public void withSortedList_AndOutOfListX_Smaller() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m3 = new MyLinkedListNode(3, null);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        assertEquals(n1.toString(), Partition.partition(m1, 0).toString());
    }

    @Test
    public void withUnSortedList() {
        MyLinkedListNode n5 = new MyLinkedListNode(5, null);
        MyLinkedListNode n4 = new MyLinkedListNode(3, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(4, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m5 = new MyLinkedListNode(1, null);
        MyLinkedListNode m4 = new MyLinkedListNode(5, m5);
        MyLinkedListNode m3 = new MyLinkedListNode(2, m4);
        MyLinkedListNode m2 = new MyLinkedListNode(3, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(4, m2);

        assertEquals(n1.toString(), Partition.partition(m1, 3).toString());
    }

    @Test
    public void withUnSortedList_AndOutOfScopeX() {
        MyLinkedListNode n5 = new MyLinkedListNode(6, null);
        MyLinkedListNode n4 = new MyLinkedListNode(3, n5);
        MyLinkedListNode n3 = new MyLinkedListNode(4, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m5 = new MyLinkedListNode(1, null);
        MyLinkedListNode m4 = new MyLinkedListNode(6, m5);
        MyLinkedListNode m3 = new MyLinkedListNode(2, m4);
        MyLinkedListNode m2 = new MyLinkedListNode(4, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(3, m2);

        assertEquals(n1.toString(), Partition.partition(m1, 5).toString());
    }
}