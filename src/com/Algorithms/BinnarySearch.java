package com.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinnarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int size = sc.nextInt();
        /*Writing in array */
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int x = sc.nextInt();

        Binaryseach(x,arr);
    }

    private static int Binaryseach(int x, int[] arr) {

        Arrays.stream(arr).sorted();
        int mid , start = 0, end= arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            mid= (int) Math.floor((start+end)/2);

            if (x== arr[mid]){
                System.out.println("element is found at - "+ mid);
                return mid;
            } else if (x < arr[mid]) {
                end = mid-1;
            } else if (x > arr[mid]) {
                start = mid+1;
            }
        }
        return -1;
    }
}
