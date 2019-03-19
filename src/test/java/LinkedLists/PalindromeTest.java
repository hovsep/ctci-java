package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {


    @Test
    public void withOneElement() {
        MyLinkedListNode n1 = new MyLinkedListNode(1, null);

        assertTrue(Palindrome.isPalindrome(n1));
    }

    @Test
    public void withThreeElements() {
        MyLinkedListNode n3 = new MyLinkedListNode(1, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        assertTrue(Palindrome.isPalindrome(n1));
    }

    @Test
    public void withFourElements() {
        MyLinkedListNode n4 = new MyLinkedListNode(1, null);
        MyLinkedListNode n3 = new MyLinkedListNode(2, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        assertTrue(Palindrome.isPalindrome(n1));
    }

    @Test
    public void withFourElements_NotPalindrome() {
        MyLinkedListNode n4 = new MyLinkedListNode(3, null);
        MyLinkedListNode n3 = new MyLinkedListNode(2, n4);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);

        assertFalse(Palindrome.isPalindrome(n1));
    }
}
