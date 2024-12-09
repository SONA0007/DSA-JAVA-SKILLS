package com.Stack;

import java.util.Stack;
import java.util.HashMap;

public class ValidParenthesis {
}

class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets
            } else {
                if (stack.isEmpty()) return false; // No matching opening bracket
                char top = stack.pop(); // Check the top of the stack
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // All brackets must be matched
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([])"));     // true
    }
}

class ValidParenthesesMap {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) { // Closing bracket
                char top = stack.isEmpty() ? '#' : stack.pop(); // '#' acts as a placeholder
                if (top != map.get(c)) return false;
            } else { // Opening bracket
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([])"));     // true
    }
}

class ValidParenthesesArray {
    public static boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1; // Acts as the index for the top of the stack

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c; // Push to the stack
            } else {
                if (top == -1) return false; // Stack is empty
                char last = stack[top--]; // Pop the top element
                if ((c == ')' && last != '(') ||
                        (c == '}' && last != '{') ||
                        (c == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return top == -1; // Stack should be empty
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([])"));     // true
    }
}
