package com.LinkedList;
// Node class representing a single node in the linked list
class Node1 {
    int data;       // Value of the node
    Node next;      // Pointer to the next node

    // Constructor to initialize a node
    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the singly linked list
class LinkedList {
    Node head; // Head of the linked list

    // Method to add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty
            head = newNode;
        } else { // Traverse to the end and append the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to find the length of the linked list
    public int getLength() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++; // Increment the counter for each node
            current = current.next;
        }
        return length;
    }
}

// Main class to test the linked list
public class LinkedListLength {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Finding and printing the length of the linked list
        System.out.println("Length of the linked list: " + list.getLength());
    }
}
