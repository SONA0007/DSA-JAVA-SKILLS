package com.ArraysInJava;

import java.util.Arrays;
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
        /* int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE; this is not working? */
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

        /*Take an array of numbers as input and
        check if it is an array sorted in ascending order.*/
        boolean isAscending = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] > arr[i]) {
                isAscending = false;
                break;
            }
        }

        if(isAscending) System.out.println("array is in ascending order.");
        else System.out.println("Not ascending. ");

        /*Sort unsorted array*/
        Arrays.sort(arr);
        System.out.println("Sorted Array");
        for (int j : arr) {
            System.out.print(" " + j);

        }
        /*Average of array elements*/
        double sum=0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("\nAverage of array elements : " +sum/arr.length);
        /*Inserting in array*/


    }
}
