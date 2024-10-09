package com.FunctionsPractice;

import java.util.Scanner;

public class GCD {

    public static void GreatestCommonDivisor(int n1, int n2){
       /* Logic 1
        while (n1 != n2){
            if (n1> n2) {
                n1 -= n2;
            }else {
                n2 -= n1;
            }
        }
        System.out.println("GCD of 2 num : "+ n1);*/
        //Logic 2
        int gcd =1;
        for (int i = 1; i <= n1 && i<=n2; ++i) {
            if (n1%i == 0 && n2%i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD is : "+ gcd);
        /* Logic 3 */
        /* public static int gcd(int p, int q){
           if (q == 0) return p;
           int r = p % q;
           return gcd(q, r);
         } */
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        GreatestCommonDivisor(n1,n2);
    }
}
