package com.FunctionsPractice;

import java.util.Scanner;

/*Write a function that takes in age as input and returns if that person is eligible to vote or not.
A person of age > 18 is eligible to vote.*/
public class VoteEligible {
    public static void VoteEligibility(int age){
        if (age>18){
            System.out.println(" You ae eligible to vote");
        }else {
            System.out.println(" You are not eligible");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        VoteEligibility(age);
    }
}
