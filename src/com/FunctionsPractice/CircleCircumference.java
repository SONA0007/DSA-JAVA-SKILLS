package com.FunctionsPractice;

import java.util.Scanner;

/*Write a function that takes in the radius as input and returns the circumference of a circle.*/
public class CircleCircumference {

    public static void Circumference(int radius){
        System.out.println(Math.PI*2*radius);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Circumference(r);
    }

}
