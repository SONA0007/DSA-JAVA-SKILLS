package leetcode.ArrayQA;

import java.util.Scanner;

/*Write a Program to find two array elements in an array that add up to a number.*/
public class TwoSumArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + arr[i + 1] == target) {
                System.out.println(arr[i]);
                System.out.println(arr[i + 1]);
            }
        }
    }
}
