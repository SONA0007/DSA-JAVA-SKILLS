package leetcode.Easy.StringQA;

import java.util.Arrays;

/*
Given two strings s and t, return true if t is an
anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false

* */
public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str1.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        return Arrays.equals(str1Arr, str2Arr);
    }
}
