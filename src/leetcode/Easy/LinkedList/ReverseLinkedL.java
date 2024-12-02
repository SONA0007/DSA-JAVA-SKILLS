package leetcode.Easy.LinkedList;

/*class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}*/
public class ReverseLinkedL {
    public ListNode reverseListIterative(ListNode head) {
        ListNode previous = null;
        // We interchange the next and previous positions of the nodes,
        // so the orders get interchanged
        for (ListNode current = head; current != null; ) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
