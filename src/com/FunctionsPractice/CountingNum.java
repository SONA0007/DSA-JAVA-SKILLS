package com.FunctionsPractice;

import java.util.Scanner;

/*Write a program to enter the numbers till the user wants
and at the end it should display the count of positive, negative and zeros entered. */
public class CountingNum {

    public static void CountNum(int[] arr){
        int positiveInt = 0;
        int negativeInt = 0;
        int ZeroInt = 0;
        for (int num: arr){
            if (num > 0) {
                positiveInt++;
            } else if (num<0) {
                negativeInt++;
            }else {
                ZeroInt++;
            }
        }
        System.out.println("positive integers - " +positiveInt);
        System.out.println("negative integers - "+negativeInt);
        System.out.println("Number of zeros - " +ZeroInt);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CountNum(arr);
    }
}
