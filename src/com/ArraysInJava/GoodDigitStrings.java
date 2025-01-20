package com.ArraysInJava;

import java.util.*;

public class GoodDigitStrings {

    private static final int MOD = 1000000007;

    public static int countGoodDigitStrings(int n) {
        if (n == 0) return 0;

        // Count of even digits: 0, 2, 4, 6, 8
        int evenCount = 5;

        // Count of prime digits: 2, 3, 5, 7
        int primeCount = 4;

        // dp[i][0] = number of good digit strings of length i ending at an even index
        // dp[i][1] = number of good digit strings of length i ending at an odd index
        long[][] dp = new long[n + 1][2];

        // Base case: single character strings
        dp[1][0] = evenCount; // Strings of length 1 at even index
        dp[1][1] = primeCount; // Strings of length 1 at odd index

        // Fill the dp table for lengths 2 to n
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][1] * evenCount) % MOD; // Extend odd index strings with an even digit
            dp[i][1] = (dp[i - 1][0] * primeCount) % MOD; // Extend even index strings with a prime digit
        }

        // Total good digit strings of length n
        return (int) ((dp[n][0] + dp[n][1]) % MOD);
    }

    public static void main(String[] args) {
        // Test the function
        int n = 4;
        System.out.println("Total good digit strings of length " + n + ": " + countGoodDigitStrings(n));
    }
}
