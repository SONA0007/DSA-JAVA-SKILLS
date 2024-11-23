package com.recursion;

public class Sequence {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Sequence " + input + " :");
        sequenceGenerator(input, 0, "");
    }

    //    inclusion exclusion approach //using recursive backtracking
    /*      O(2^n): Every character can either be included or excluded.
            O(n): Space complexity due to recursion stack.      */
    public static void sequenceGenerator(String s, int index, String current) {
        //base case
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        //include char
        sequenceGenerator(s, index + 1, current + s.charAt(index));
        // exclude char
        sequenceGenerator(s, index + 1, current);
    }
}
/*
public static int countSubsequences(String s, String target) {
    int n = s.length(), m = target.length();
    int[][] dp = new int[n + 1][m + 1];

    // Base case: An empty target can be formed by any subsequence
    for (int i = 0; i <= n; i++) {
        dp[i][0] = 1;
    }

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            dp[i][j] = dp[i - 1][j]; // Exclude current character
            if (s.charAt(i - 1) == target.charAt(j - 1)) {
                dp[i][j] += dp[i - 1][j - 1]; // Include current character
            }
        }
    }
    return dp[n][m];
}
*/
