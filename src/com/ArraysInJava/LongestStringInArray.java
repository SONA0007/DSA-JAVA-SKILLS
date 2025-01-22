package com.ArraysInJava;

public class LongestStringInArray {
    public static void main(String[] args) {
        String[] arr = {"xys", "dhklk", "sgu", "hd"};
        String longest = findLongeststr(arr, 0, "");
        System.out.println("longest str:  " + longest);
    }

    public static String findLongeststr(String[] arr, int ind, String longest) {
        if (ind == arr.length) {
            return longest;
        }
        if (arr[ind].length() > longest.length()) {
            longest = arr[ind];
        }
        return findLongeststr(arr, ind + 1, longest);
    }
}
