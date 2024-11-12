package com.LinkedList.RestaurantWaitingSinglyList;

class Node {
    String customerName;
    String customerDetails;
    Node customerNext;

    public Node(String customerName, String customerDetails) {
        this.customerName = customerName;
        this.customerDetails = customerDetails;
        this.customerNext = null; // Initialize the next reference to null
    }
}

public class WaitingList {
    public static void main(String[] args) {
        // Create an instance of the WaitingList class
        WaitingList wl = new WaitingList();

        wl.addFirstCustomer("sonal", "with 4 people.");
        wl.addOtherCustomer("prashant", "with 8 people.");
        wl.printWaitingList();
        wl.removeCustomer("sonal");
        wl.printWaitingList();
    }

    Node head; // Head node representing the start of the waiting list

    // Adds the first customer to the waiting list
    public void addFirstCustomer(String name, String details) {
        head = new Node(name, details); // Create a new Node and set it as the head
    }

    // Adds a new customer to the end of the waiting list
    public void addOtherCustomer(String name, String details) {
        // Create a new Node for the new customer
        Node newCustomer = new Node(name, details);

        // If the list is empty, set the new customer as the head
        if (head == null) {
            head = newCustomer;
        } else {
            // Traverse to the end of the list to add the new customer
            Node currentCustomer = head; //Starting from head node
            while (currentCustomer.customerNext != null) {
                currentCustomer = currentCustomer.customerNext; // Move to the next node
            }
            // Link the reference of current node to the new customer
            currentCustomer.customerNext = newCustomer;
        }
    }

    // Prints the entire waiting list of customers
    public void printWaitingList() {
        // Start from the head of the list
        Node currentCustomer = head;

        // Traverse through the list and print each customer’s details
        while (currentCustomer != null) {
            System.out.print(currentCustomer.customerName + " (" + currentCustomer.customerDetails + ") -> ");
            currentCustomer = currentCustomer.customerNext; // Move to the next customer
        }
        System.out.println("null"); // Indicate the end of the list
    }

    // Remove the customer from waiting list
    public void removeCustomer(String name) {
        if (head == null) { // There is no customer
            return;
        }
        if (head.customerName.equals(name)) { // entered value is equal to customer name
            // the head is updated to the next node in the list, effectively removing the current head.
            head = head.customerNext;
        }
        //loop to traverse the list
        Node current = head;
        while (current.customerNext != null && !current.customerNext.customerName.equals(name)) {
            current.customerNext = current;
        }
        if (current.customerNext != null)
            current.customerNext = current.customerNext.customerNext;
    }
}
