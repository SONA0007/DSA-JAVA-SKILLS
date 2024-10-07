package com.ArraysInJava;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int size = sc.nextInt();
        /*Writing in array */
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Array Contains:");
        /*Reading from Array or
        * Traversing */
        for (int j : arr) {
            System.out.print(" " + j);
        }
    /*Find the maximum & minimum number in an array of integers. */
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("\nmin - " + min);
        System.out.println("max - " + max);
    }
}
