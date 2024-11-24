package com.ArraysInJava;

//Brute Force
public class ArraySortCheck {

    public static boolean isSortedBruteForce(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Not sorted
            }
        }
        return true; // Sorted
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Is the array sorted (Brute Force)? " + isSortedBruteForce(arr));
    }
}

//Optimal approach
class ArraySortedCheck {

    public static boolean isSortedOptimal(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false; // Not sorted
            }
        }
        return true; // Sorted
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Is the array sorted (Optimal)? " + isSortedOptimal(arr));
    }
}

