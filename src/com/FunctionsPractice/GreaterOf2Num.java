package com.FunctionsPractice;

import java.util.Scanner;

/*Write a function which takes in 2 numbers and returns the greater of those two*/
public class GreaterOf2Num {
    public static void GreaterNum(int num1, int num2){
        System.out.println(Math.max(num1, num2));
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        GreaterNum(a,b);
    }
}
