package com.Stack.Implementation;

import java.util.Stack;

public class InBuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(11);
        System.out.println("Stack after pushing : " + stack);

        stack.add(1, 22);
        System.out.println("Stack after adding element at 1 : " + stack);
        System.out.println("Searching the element 11 : " + stack.search(11));
        System.out.println(stack);
        System.out.println("Peeking at the top : " + stack.peek());
    }
}
