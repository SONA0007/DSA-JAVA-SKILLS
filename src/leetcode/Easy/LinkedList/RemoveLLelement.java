package leetcode.Easy.LinkedList;

public class RemoveLLelement {

    public ListNode removeElements(ListNode head, int val) {
        // Remove all nodes with the given value from the head
        while (head != null && head.val == val) {
            head = head.next;
        }

        // If the list is empty, return null
        if (head == null) {
            return null;
        }

        // Initialize the current node
        ListNode current = head;

        // Traverse through the list
        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with the target value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }
        // Return the modified head of the list
        return head;
    }
}

class ListNode {
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
}
/**
 * Definition for singly-linked list.
 */


