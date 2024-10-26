package com.Algorithms;
public class SelectionSort {
    public static void main(String[] args) {
        int[] heightOfBooks = {29, 10, 14, 37, 13};
        selectionSort(heightOfBooks);

        System.out.print("Sorted heightOfBooks in ascending order: ");
        for (int number : heightOfBooks) {
            System.out.print(number + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        /* i < n-1 bcoz, last element will be automatically sorted ,
        once other ar sorted.*/

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 3 step swaping
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}