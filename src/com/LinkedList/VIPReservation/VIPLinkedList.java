package com.LinkedList.VIPReservation;

/*
1.	Create a New Node:
        1.1.	First, create a new node to store the VIP customer’s information.
        1.2.	This new node will hold the customer's name and details.
2.	Link the New Node to the Current Head:
        2.1.	Next, you’ll link the new node to the current list.
        2.2.	Since the new node is a VIP, it should be placed at the beginning of the list.
        2.3.	To do this, set the new node’s next reference to point to the current head of the list. This step connects the new VIP customer to the existing list, effectively inserting them at the start.
3.	Update the Head to the New Node:
        3.1.	Finally, you need to update the head of the list to this new node.
        3.2.	This step makes the new VIP customer the first node in the linked list.
*/
class Node {
    String name;
    String details;
    Node next;

    public Node(String name, String details) {
        this.name = name;
        this.details = details;
        this.next = null;
    }
}

public class VIPLinkedList {
    public static void main(String[] args) {
        VIPLinkedList vipLinkedList = new VIPLinkedList();

        vipLinkedList.addCustomer("Sonal", "Special force unit.");
        vipLinkedList.addCustomer("Neha", "Army member.");
        vipLinkedList.printVIPlist();
        vipLinkedList.addVIPCustomer("VIP Charlie", "CEO");
        vipLinkedList.addVIPCustomer("VIP Marry", "CEO's Wife");
        vipLinkedList.printVIPlist();
    }

    Node head;

    public void printVIPlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.name + "(" + current.details + ") -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addVIPCustomer(String name, String details) {
        // vip customer is added to head
        // just like how temp concept work
        Node newnode = new Node(name, details);
        //Point new node's next to the current head of the list
        newnode.next = head;
        //head will be new node
        head = newnode;
    }

    public void addCustomer(String name, String details) {
        Node newNode = new Node(name, details);
        if (head == null) {
            head = newNode;
        } else {
            Node current;
            for (current = head; current.next != null; current = current.next) {
                // The for loop automatically iterates through the nodes
            }
            // After the loop, 'current' will point to the last node
            current.next = newNode;
        }
    }

    public void removeMember(String nameToRemove) {
        if (head == null) {
            return; // Empty list, nothing to remove
        }

        // Check if the head node is the one to remove
        if (head.name.equals(nameToRemove)) {
            head = head.next;
            return; // Exit after removing the head node to avoid traversal
        }
/*
    We start the loop with current set to head,
    This ensures that the loop only runs as long as current.next is not null, meaning we haven’t reached the end of the list.
    After each iteration, current is updated to the next node, advancing the loop.
*/
        //  this is only traversal through the VIPlist to update changes we want, otherwise it does nothing.
        for (Node current = head; current.next != null; current = current.next) {
            if (current.next.name.equals(nameToRemove)) {
                current.next = current.next.next;
                break; // Exit after removing the node
            }
            /*  We check if current.next.name.equals(nameToRemove). If this is true, it means current.next is the node we want to remove.
                Remove the Node: Set current.next = current.next.next, which skips over the node to be removed.
                Break: After removing the node, we exit the loop immediately with break to avoid unnecessary traversal.     */
        }
    }

}

