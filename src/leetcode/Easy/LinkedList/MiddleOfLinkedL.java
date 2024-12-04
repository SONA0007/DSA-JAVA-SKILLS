package leetcode.Easy.LinkedList;
/*
876. Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
*/
public class MiddleOfLinkedL {
    public ListNode middleUsingCount(ListNode head) {
        int count = 0;
        // temp is pointer to traverse
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

    /*  Hare and tortoise solution or
     *  slow and fast pointer */
    public ListNode middle2Pointer(ListNode head) {
        ListNode slow = head; // consider it as ur friend, and his speed is half of yours
        ListNode fast = head; // fast as yourself, once you complete the distance, make him stop.

        //Running loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

