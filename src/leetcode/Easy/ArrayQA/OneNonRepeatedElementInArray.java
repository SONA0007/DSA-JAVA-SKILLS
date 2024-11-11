package leetcode.Easy.ArrayQA;
/*Write a Program to find that one element in an on-empty array of integers nums,
where every element appears twice except for one.Example:
Input: nums = [2,2,1]Output: 1*/
public class OneNonRepeatedElementInArray {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 1, 4};
        System.out.println("The single element is: " + findSingleNumber(nums));
    }

    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
/*
The XOR operation has a few key properties:
a⊕a=0
a⊕0=a
XOR is both commutative and associative.

By XORing all the numbers together, pairs of the same number will cancel each other out,
leaving the single number that appears only once.
*/
