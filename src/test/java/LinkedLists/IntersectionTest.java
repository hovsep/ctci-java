package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntersectionTest {

    @Test
    public void withTwoSeparatedLists() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m3 = new MyLinkedListNode(6, null);
        MyLinkedListNode m2 = new MyLinkedListNode(5, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(4, m2);

        assertFalse(Intersection.intersects(n1, m1));
    }

    @Test
    public void withTwoSeparatedLists_HavingSameValue() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m3 = new MyLinkedListNode(6, null);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        assertFalse(Intersection.intersects(n1, m1));
    }

    @Test
    public void withIntersectedLists() {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        MyLinkedListNode m1 = new MyLinkedListNode(1, n2);

        assertTrue(Intersection.intersects(n1, m1));
    }
}
