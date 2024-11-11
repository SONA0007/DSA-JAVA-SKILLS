package leetcode.Easy.ArrayQA;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1}; // example input
        int maxConsecutive = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum number of consecutive 1s is: " + maxConsecutive); // Output: 3
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
