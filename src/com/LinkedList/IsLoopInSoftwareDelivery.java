package com.LinkedList;

/*Question-Scenario:
You are a software developer at a logistics company. Your company
maintains a system to track packages as they move through different
stages of delivery. Each package's journey is represented as a linked list,
where each node contains information about a stage in the delivery
process.

Recently, some packages have been reported to be stuck in an infinite loop
in the tracking system, causing delays and confusion. To prevent this, you
need to implement a function to detect any structural issues in the package
tracking system.
Problem Statement:
Given the head of a linked list representing the stages of a package's
journey, you need to determine if there is a structural issue causing an
infinite loop.
*/
class ListNode {
    int val;
    ListNode next;

    // Constructor
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class IsLoopInSoftwareDelivery {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one node, no cycle exists.
        }
        //Floyd’s Cycle Detection or two pointer approach
        ListNode slow = head; // Slow pointer
        ListNode fast = head; // Fast pointer

        // Move the pointers until fast or fast.next becomes null
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by one step
            fast = fast.next.next;     // Move fast pointer by two steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle detected
    }

    public static ListNode LinkedListWithCycle(int[] values, int cycleIndex) {
        ListNode head = null, tail = null, cycleNode = null;

        for (int i = 0; i < values.length; i++) {
            ListNode newNode = new ListNode(values[i]);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            // Keeping the track of the node where the cycle should begin
            if (i == cycleIndex) {
                cycleNode = newNode;
            }
        }
        // Create a cycle if cycleIndex is valid
        if (cycleNode != null) {
            tail.next = cycleNode;
        }
        return head;
    }

    public static void main(String[] args) {

        int[] input1 = {20, 30, 40, 60, 80};
        ListNode head1 = LinkedListWithCycle(input1, 2); // Cycle starts at the 3rd node
        System.out.println("Cycle Detected (Expected true): " + hasCycle(head1));
        int[] input2 = {6, 4, 2, 8};
        ListNode head2 = LinkedListWithCycle(input2, -1);
        System.out.println("Cycle Detected (Expected false): " + hasCycle(head2));

    }
}
