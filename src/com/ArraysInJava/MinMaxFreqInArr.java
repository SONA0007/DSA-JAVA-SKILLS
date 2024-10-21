package com.ArraysInJava;

import java.util.Scanner;

/*Return max and min freq elements from an arr
* Find the frequency of each element in the array*/

public class MinMaxFreqInArr {
    public static void MinMaxFreq(int arr[]){

    }
    public static void FrequencyFinder(int arr[]){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array -");
        int size = sc.nextInt();
        /*Writing in array */
        System.out.println("enter array element -");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        MinMaxFreq(arr);
        System.out.println("Frequncy of each element - ");
        FrequencyFinder(arr);
    }
}
