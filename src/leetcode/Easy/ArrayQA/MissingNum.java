package leetcode.Easy.ArrayQA;
/*  Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
*/
import java.util.Arrays;
import java.util.Scanner;
public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements - ");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = size*(size+1)/2;// sum of n natural elements
        int actualSum =0;
//      sum of arrays
        for (int i = 0; i < size; i++) {
            actualSum += arr[i];
        }
        int ans = expectedSum-actualSum;
        System.out.println("Missing num is "+ ans);
    }
}

/*First sort the elements then compare their index*/
class MissingNum2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements - ");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing num "+ Misingnum(arr));

    }
    public static int Misingnum(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n ; i++) {
            if (i != arr[i]) { // Compare with i+1 to match the index
                return i ; // Return i+1 since the array is 0-based
            }
        }
        return n;
    }
}
class MissingNumberXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array
        int n = arr.length + 1; // Including the missing number
        int xor = 0;

        // XOR all array elements
        for (int num : arr) {
            xor ^= num;
        }

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        System.out.println("The missing number is: " + xor);
    }
}

/*leetcode answer :
* class Solution {
    public int missingNumber(int[] nums) {

        int Actualsum= n*(n+1)/2;
        int n = nums.length;
        int sum =0;
       for(int i=0 ; i < n; i++){
        sum += nums[i];
       }
       int ans = Actualsum-sum;
       return ans;
    }

}*/
