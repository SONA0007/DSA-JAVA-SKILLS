package com.DoublyLinkedList;

public class newDoublyListExample {
    DLNode head;
    DLNode tail;

    public void addFront(int data) {
        DLNode newNode = new DLNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addEnd(int data) {
        DLNode newNode = new DLNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addAfter(DLNode prevNode, int data) {
        if (prevNode == null) {
            return; // Check if the previous node is null
        }
        DLNode newNode = new DLNode(data); // Create a new node
        newNode.next = prevNode.next; // Set the next of new node to next of prev node
        prevNode.next = newNode; // Set the next of prev node to new node
        newNode.prev = prevNode; // Set the previous of new node to prev node

        if (newNode.next != null) { // Check if the new node is not the last node
            newNode.next.prev = newNode; // Set the next node's prev to the new node
        } else { // If the new node is the last node
            tail = newNode; // Set the tail to the new node
        }
    }

    public void traverseForward() {
        DLNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        DLNode current = tail;
        while (current != null) {
            System.out.println(current.prev);
            current = current.prev;
        }
        System.out.println();
    }
}

class DLNode {
    int data;
    DLNode next;
    DLNode prev;

    public DLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
