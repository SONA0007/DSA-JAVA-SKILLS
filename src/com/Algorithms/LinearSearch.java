package com.Algorithms;

import java.util.Scanner;

public class LinearSearch {

    public static int Linearseach(int x, int[] arr){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                System.out.println("element is in array at "+ i);
                found= true;
                break;
            }
        }
        return -1;
    }
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

        Linearseach(x,arr);
    }
}
