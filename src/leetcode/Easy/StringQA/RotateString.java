package leetcode.Easy.StringQA;
/*796
Given two strings s and goal, return true if and only if s can become goal after
some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example,
if s = "abcde", then it will be "bcdea" after one shift.
*/

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(s.concat(s));

        System.out.println(rotateString(s, goal));

    }

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String str = s.concat(s);

        return str.contains(goal);

    }
}
