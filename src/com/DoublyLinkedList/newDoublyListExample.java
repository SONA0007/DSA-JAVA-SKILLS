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
