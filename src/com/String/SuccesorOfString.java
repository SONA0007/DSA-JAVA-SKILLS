package com.String;

/* Question - Get the succesor of the last char of string

doubt -
        explaination, why for loop exit for given string abcd?
    For lowercase letters ('a' to 'z'), if the letter is 'z', it wraps around to 'a', creating a carry
    to the next character on the left.
    For uppercase letters ('A' to 'Z'), if the letter is 'Z', it wraps around to 'A'.
    If it’s any other letter, it increments the letter by 1 (e.g., 'd' becomes 'e')
    and exits early with
line 42
    return sb.toString();, since no carry is needed.

*/
public class SuccesorOfString {
    public static void main(String[] args) {
        String input = "abcd";
        String output = getSuccessor(input);
        System.out.println("Successor of '" + input + "' is: " + output);

    }

    public static String getSuccessor(String s) {

        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
//        I don't get the question, carry is propagated
        // Start from the rightmost character
        for (int i = n - 1; i >= 0; i--) {
            char ch = sb.charAt(i);

            if (Character.isDigit(ch)) {
                if (ch == 9) {
                    sb.setCharAt(i, '0');
                } else {
                    sb.setCharAt(i, (char) (ch + 1));
                    return sb.toString();
                }
            } else if (Character.isLetter(ch)) {
                if (ch == 'z') {
                    sb.setCharAt(i, 'a');
                } else if (ch == 'Z') {
                    sb.setCharAt(i, 'A');
                } else {
                    sb.setCharAt(i, (char) (ch + 1));
                    return sb.toString();
                }
            }
        }
        // If we reach here, it means the carry propagated to the leftmost character
        // For example, "zz" should become "aaa"
        return sb.insert(0, 'a').toString();
    }
}
