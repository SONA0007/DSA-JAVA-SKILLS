package leetcode.ArrayQA;


/*Write a Program to find that one element in an on-empty array of integers nums,
where every element appears twice except for one.Example:
Input: nums = [2,2,1]Output: 1*/
public class NonRepeatedElementInArray {
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
