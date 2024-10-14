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
// counter1< n-1 bcoz, last element will be automatically sorted ,
// once other ar sorted.
        for (int counter1 = 0; counter1 < n - 1; counter1++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = counter1;
            for (int counter2 = counter1 + 1; counter2 < n; counter2++) {
                if (arr[counter2] < arr[minIndex]) {
                    minIndex = counter2;
                }
            }
            // 3 step swaping
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[counter1];
            arr[counter1] = temp;
        }
    }
}