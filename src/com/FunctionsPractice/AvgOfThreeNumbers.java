package com.FunctionsPractice;

import java.util.Scanner;

/*Enter 3 numbers from the user & make a function to print their average.*/
public class AvgOfThreeNumbers {

    public static void Avg3Num(int a, int b, int c){
        float avg = (float) (a + b + c) / 3;
        System.out.println("Average of 3 num: "+avg);
        return;
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        Avg3Num(a,b,c);
    }
}
