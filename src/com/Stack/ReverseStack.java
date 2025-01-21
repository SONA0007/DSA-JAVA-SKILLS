package com.Stack;

import java.util.Stack;

public class ReverseStack {

    // Function to reverse the stack
    public static void reverseStack(Stack<Integer> st) {
        // Base case: If the stack is empty, return
        if (st.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = st.pop();

        // Reverse the remaining stack
        reverseStack(st);

        // Insert the removed element at the bottom
        insertAtBottom(st, top);
    }

    // Helper function to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> st, int element) {
        // Base case: If the stack is empty, push the element
        if (st.isEmpty()) {
            st.push(element);
            return;
        }

        // Remove the top element, the popped element will be the bottom element of reversed stack
        int top = st.pop();

        // Recursively insert the element at the bottom
        insertAtBottom(st, element);

        // Push the removed element back to the stack
        st.push(top);
    }

    public static void main(String[] args) {
        // Example stack
        Stack<Integer> st = new Stack<>();
        st.push(111);
        st.push(222);
        st.push(333);
        st.push(444);
        st.push(555);

        System.out.println("Original Stack: " + st);

        // Reverse the stack
        reverseStack(st);

        System.out.println("Reversed Stack: " + st);
    }
}
