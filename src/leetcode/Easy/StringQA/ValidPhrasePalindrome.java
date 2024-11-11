package leetcode.Easy.StringQA;

/* 125
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
* */
public class ValidPhrasePalindrome {
    public static void main(String[] args) {
        String s = "Okay this is phrase palindrome!";

        // call the method
        System.out.println(isPhrasePalindrome(s));

    }

    public static boolean isPhrasePalindrome(String s) {
        s = s.toLowerCase();

        // remove non-alphanumeric char
        StringBuilder sbFiltered = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (Character.isLetterOrDigit(i)) {
                sbFiltered.append(i);
            }
        }
        //convert char array to string
        String Filter_str = sbFiltered.toString();
        // reverse the Filtered String
        String reverse_str = sbFiltered.reverse().toString();

        //instead of creating another string , we can
        //return sbFiltered.toString().equals(sbFiltered.reverse().toString());
        // long run time,

        //compare them
        return Filter_str.equals(reverse_str);

        /*  Time Complexity: O(n)
            Space Complexity: O(n)
         */

        // you can solve it by using two pointers method which is more optimized.
    }
    /*public static boolean TwoPointersWayPalindrome(String s){
     *//*  Time Complexity: O(n)
            Space Complexity: O(1)
         *//*


    }*/
}
