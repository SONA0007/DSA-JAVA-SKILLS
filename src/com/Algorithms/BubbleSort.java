package com.Algorithms;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        /* Writing in array */
        System.out.println("Enter array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array
        arr = bubblesort(arr);

        // Printing sorted array
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Comparing adjacent elements and swapping them
    public static int[] bubblesort(int arr[]) {
        int temp;
        // this is to pass or iteration
        for (int j = 1; j < arr.length ; j++) {
            // compare adjacent elements
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
