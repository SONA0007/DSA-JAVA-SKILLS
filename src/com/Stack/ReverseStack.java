package com.Stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> st) {
        // Base case: If the stack is empty, return
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }
    public static void insertAtBottom(Stack<Integer> st, int element) {
        if (st.isEmpty()) {
            st.push(element);
            return;
        }
        // Remove the top element, the popped element will be the bottom element of reversed stack
        int top = st.pop();
        insertAtBottom(st, element);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(111);
        st.push(222);
        st.push(333);
        st.push(444);
        st.push(555);
        System.out.println("Original Stack: " + st);
        reverseStack(st);
        System.out.println("Reversed Stack: " + st);
    }
}
