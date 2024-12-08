package leetcode.Easy.ArrayQA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* 442
* Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice,
*  return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant auxiliary space,
* excluding the space needed to store the output.
* */
public class findDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("The duplicate numbers are: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();


        for (int num : nums) {
            if (seen.contains(duplicates)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        return duplicates;
    }
}
