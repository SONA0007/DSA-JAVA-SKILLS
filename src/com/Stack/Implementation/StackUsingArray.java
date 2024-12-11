package com.Stack.Implementation;

public class StackUsingArray {
    private int[] stack1;
    private int top;

    // Constructor to initialize with fixed size
    public StackUsingArray(int size) {
        stack1 = new int[size];
        top = -1;//indicating empty stack
    }

    public void pushOnStack(int value) {
        if (top == stack1.length) {
            System.out.println(" stack is full, so can't push.");
        } else {
            stack1[++top] = value;
            System.out.println(value + " is added to stack top.");
        }
    }

    public int popvalue() {
        if (top == -1) {
            System.out.println("Stack is empty cant pop.");
        } else {
            int poppedValue = stack1[top--];
            System.out.println("Popped Element : " + poppedValue);
            return poppedValue;
        }
        return popvalue();
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(5);
        stackUsingArray.pushOnStack(10);
        stackUsingArray.pushOnStack(20);
        stackUsingArray.popvalue();
    }
}
