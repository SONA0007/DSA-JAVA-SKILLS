package com.recursion;

public class Sequence {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Sequence " + input + " :");
        sequenceGenerator(input, 0, "");
    }

    //    inclusion exclusion approach
    public static void sequenceGenerator(String s, int index, String current) {
        //base case
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        //include char
        sequenceGenerator(s, index + 1, current + s.charAt(index));
        // exclude char
        sequenceGenerator(s, index + 1, current);
    }
}
