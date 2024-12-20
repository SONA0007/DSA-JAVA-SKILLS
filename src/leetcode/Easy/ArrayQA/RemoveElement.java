package leetcode.Easy.ArrayQA;

import java.util.Scanner;

/*27. Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed.
Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, to get accepted,
you need to do the following things:
Change the array nums such that the first k elements of nums contain the elements
which are not equal to val. The remaining elements of nums are not important
as well as the size of nums. Return k.*/
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4};

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        int ans = removeElement(nums, val);
        System.out.println(ans);
    }

}
