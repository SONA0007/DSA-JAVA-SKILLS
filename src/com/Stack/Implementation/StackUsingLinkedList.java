package com.Stack.Implementation;

public class StackUsingLinkedList {
    private Node top;

    private class Node {
        int data;
        Node next;
    }

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = top;
        top = newNode;
        System.out.println(value + " is added to top of stack.");
    }

    public int pop() {
        if (top == null) {
            return -1;
        } else {
            int popValue = top.data;
            top = top.next;// Move the top to the next node
            System.out.println(popValue + " is popped from the stack.");
            return popValue;
        }
    }

    /*@Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = top;
        while (current != null){
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }*/
    // Other way to print the list is to make print list method
    public void PrintListStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(25);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(15);

        System.out.println("stack after pushing to top : ");
        stackUsingLinkedList.PrintListStack();

        System.out.println();
        stackUsingLinkedList.pop();

        System.out.println("stack after popping one element : ");
        stackUsingLinkedList.PrintListStack();
    }
}

