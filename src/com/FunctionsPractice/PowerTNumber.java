package com.FunctionsPractice;

import java.util.Scanner;

/*Two numbers are entered by the user, x and n.
Write a function to find the value of one number raised to the power of another i.e. xn.*/
public class PowerTNumber {
    public static  void PowerToNum(double n, double x){
        System.out.println(Math.pow(n,x));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power");
        double n = sc.nextDouble();
        System.out.println("Enter the number");
        double x = sc.nextDouble();

        PowerToNum(n,x);
    }
}
