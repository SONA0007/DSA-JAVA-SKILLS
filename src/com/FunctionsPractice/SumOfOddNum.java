package com.FunctionsPractice;
import java.util.Scanner;
/*Write a function to print the sum of all odd numbers from 1 to n.*/
public class SumOfOddNum {
    static int sum;
    public static void SumOfOdd(int n){

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                System.out.print(" "+i);
                sum+=i;
            }
        }
        System.out.println("\n Sum of odd numbers:"+sum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumOfOdd(n);

    }
}
