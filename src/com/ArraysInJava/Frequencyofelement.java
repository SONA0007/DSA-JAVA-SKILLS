package com.ArraysInJava;

import java.util.Scanner;

public class Frequencyofelement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int size = sc.nextInt();
        /*Writing in array */
        System.out.println(" enter array element ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        /*FREQUENCY OF ELEMENTS IN ARRAY*/
        int count = 0 ;
        System.out.println("Enter the element to find frequency for- ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== x){
                count++;
            }
        }
        System.out.println("Frequncy of element is "+ count);
        /*Count of even*/
        for (int j : arr){
            if ( arr[j] % 2 == 0){
           count++;
        }
      }
    }
}
//*Return max and min freq elements from an arr ? OR Sum of elements Who has even freq ?*/