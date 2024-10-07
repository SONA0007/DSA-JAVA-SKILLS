package com.FunctionsPractice;
/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
*/
import java.util.Scanner;

public class FibonacciSeries {

    public  static void FiboSeries(int n){
        int a = 0;
        int b = 1;
        int c ;
        System.out.print(a+" "+b +" ");
        // first 2 terms are already initialized so, i = 2
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FiboSeries(n);
    }
}
