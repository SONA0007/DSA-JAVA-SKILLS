package leetcode.Easy.ArrayQA;

import java.util.Scanner;

/*Write a Program to find two array elements in an array that add up to a number.*/
public class TwoSumArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
