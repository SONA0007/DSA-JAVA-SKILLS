package com.recursion;

public class Fibonacci {
    public static int FiboSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return FiboSeries(n - 1) + FiboSeries(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + FiboSeries(n));

    }
}
