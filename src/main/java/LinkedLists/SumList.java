package LinkedLists;

/**
 * Question 2.5
 *
 * You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7->1->6) + (5->9->2).That is 617 + 295.
 * Output: 2->1->9. That is 912.
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * Input: (6->1->7) + (2->9->5).That is 617 + 295.
 * Output: 9->1->2. That is, 912.
 */
public class SumList {

    public static void main(String[] args) {
        MyLinkedListNode n3 = new MyLinkedListNode(3, null);
        MyLinkedListNode n2 = new MyLinkedListNode(2, n3);
        MyLinkedListNode n1 = new MyLinkedListNode(1, n2);


        MyLinkedListNode m3 = new MyLinkedListNode(3, null);
        MyLinkedListNode m2 = new MyLinkedListNode(2, m3);
        MyLinkedListNode m1 = new MyLinkedListNode(1, m2);

        System.out.println(SumList.sumForward(n1,m1).toString());

    }

    public static MyLinkedListNode sumReverse(MyLinkedListNode n1, MyLinkedListNode n2)
    {
        int p10 = 0;
        StringBuilder sum = new StringBuilder();
        int i1 = 0;
        int i2 = 0;
        MyLinkedListNode r1 = n1;
        MyLinkedListNode r2 = n2;
        MyLinkedListNode resultTail = null;
        MyLinkedListNode resultHead = null;

        //Convert lists to int
        while ((null != r1) || (null != r2)) {
            if (null != r1) {
                i1 += Math.pow(10, p10) * r1.data;

                r1 = r1.next;
            }

            if (null != r2) {
                i2 += Math.pow(10, p10) * r2.data;
                r2 = r2.next;
            }

            p10++;
        }

        //Sum it
        sum = sum.append(i1+i2).reverse();


        //Convert result to list

        for (int j = 0; j < sum.length(); j++) {
            if (null == resultTail) {
                resultTail = new MyLinkedListNode(sum.charAt(j) - '0', null);
                resultHead = resultTail;
            } else {
                resultTail.next = new MyLinkedListNode(sum.charAt(j) - '0', null);
                resultTail = resultTail.next;
            }
        }

        return resultHead;
    }

    public static MyLinkedListNode sumForward(MyLinkedListNode n1, MyLinkedListNode n2)
    {
        int l1 = 0;
        int l2 = 0;
        int i1 = 0;
        int i2 = 0;
        StringBuilder sum = new StringBuilder();
        MyLinkedListNode r1 = n1;
        MyLinkedListNode r2 = n2;
        MyLinkedListNode resultHead = null;
        MyLinkedListNode resultTail = null;

        //Count lists sizes
        while ((null != r1) || (null != r2)) {
            if (null != r1) {
                l1++;
                r1 = r1.next;
            }

            if (null != r2) {
                l2++;
                r2 = r2.next;
            }
        }


        r1 = n1;
        r2 = n2;

        //Convert lists to integers
        while ((l1 > 0) || (l2 > 0)) {

            if (l1 > 0) {
                i1 += Math.pow(10, l1 - 1) * r1.data;
                l1--;
                r1 = r1.next;
            }

            if (l2 > 0) {
                i2 += Math.pow(10, l2 - 1) * r2.data;
                l2--;
                r2 = r2.next;
            }
        }

        sum.append(i1 + i2);

        for (int j = 0; j < sum.length(); j++) {

            if (null == resultTail) {
                resultTail = new MyLinkedListNode(sum.charAt(j) - '0', null);
                resultHead = resultTail;
            } else {
                resultTail.next = new MyLinkedListNode(sum.charAt(j) - '0', null);
                resultTail = resultTail.next;
            }
        }

            return resultHead;
    }
}
