package com.Algorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array ");
        int size = sc.nextInt();
        /*Writing in array */
        System.out.println("enter array element ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }
//    comparing adjacent elements and swapping them
    public static int[] bubblesort(int arr[]){
        int temp;
        // this is to pass or iteration
        for (int j = 0; j < arr.length; j++) {
            // compare adj elements
            for (int i = 1; i < arr.length-j; i++) {
                if(arr[i] > arr[i-1]){
                    temp   =  arr[i];
                    arr[i+1] =  arr[i];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
