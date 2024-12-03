package leetcode.Easy.LinkedList;
/*
876. Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
*/
public class MiddleOfLinkedL {

    public ListNode middleUsingCount(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = (int) Math.floor(count / 2);
        temp = head;
        for (int i = 0; i <= mid; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
