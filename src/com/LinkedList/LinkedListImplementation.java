package com.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedListImplementation llist = new LinkedListImplementation();
        // Instance of the class

        llist.addFirstNode(10);
        llist.addOther(20);
        llist.PrintList();
    }

    //head: Points to the first node in the list.
    Node head;

    //addFirst: Adds a new node at the front of the list.
    public void addFirstNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //addLast: Adds a new node at the end of the list or adding other elements
    public void addOther(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }


    //delete: Removes a node with a specific value.

    //printList: Prints all the elements in the list from head to end.
    public void PrintList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}

class Node {
    /*  Node Class:
        Represents each node in the linked list.
        Contains data and a reference (next) to the next node.  */
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}