package LinkedLists;

public class MyLinkedListNode {

    public MyLinkedListNode next = null;

    public int data;

    public MyLinkedListNode(int data, MyLinkedListNode next) {
        this.next = next;
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyLinkedListNode node = this;

        sb.append(node.data );
        while (null != node.next) {
            sb.append("->" + node.next.data);
            node = node.next;
        }

        return sb.toString();
    }
}
