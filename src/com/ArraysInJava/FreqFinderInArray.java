package com.ArraysInJava;

import java.util.Arrays;
import java.util.Scanner;

/*Return max and min freq elements from an array
* Find the frequency of each element in the array*/

public class FreqFinderInArray {

    public static void MinMaxFreq(int arr[]){
        int minFreq = Integer.MAX_VALUE, maxFreq = 1;
        int count = 1;
        Arrays.sort(arr); // Sort the array to group identical elements together

        // Traverse the sorted array to calculate frequencies
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                // Update min and max frequencies
                if (count > maxFreq) {
                    maxFreq = count;
                }
                if (count < minFreq) {
                    minFreq = count;
                }
                count = 1; // Reset count for the next element
            }
        }

        // Check the last element's frequency // why?
        /*
        - End of the Loop:
        The loop iterates through all elements of the sorted array. However,
        when the loop completes, the last element's frequency (i.e., the count) is not checked
        against the maxFreq and minFreq values unless we explicitly do so.
        This is because:
        The loop's logic only executes the frequency update (the part that checks and updates maxFreq and minFreq)
        when it encounters a new element.
        The last element may not trigger the else block to update the frequencies
        since there's no next element to trigger the comparison.
        - Final Check:
        After the loop, we must check the last counted frequency to ensure it is correctly considered
        when determining the maximum and minimum frequencies.
        This is crucial because the last element might have the highest or lowest frequency.*/

        if (count > maxFreq) {
            maxFreq = count;
        }
        if (count < minFreq) {
            minFreq = count;
        }

        if (minFreq == maxFreq) {
            System.out.println("All elements have the same frequency: " + minFreq);
        } else {
            System.out.println("Max frequency: " + maxFreq);
            System.out.println("Min frequency: " + minFreq);
        }
    }

    /*Using sorting and single loop , other ways - 2.HashMap 3.TreeMap */
    public static void FrequencyOfEach(int arr[]){
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                count++;
            }else {
                // printing count before resetting count to one
                System.out.println("Count of "+arr[i-1]+" is - "+ count);
                count=1;// resetting the count before moving to next element
            }
        }
        System.out.println("Count of "+arr[arr.length-1]+" is - "+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array -");
        int size = sc.nextInt();
        /*Writing in array */
        System.out.println("enter array element -");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Frequency of each element - ");
        FrequencyOfEach(arr);
        System.out.println("Min and max frequency from the elements : ");
        MinMaxFreq(arr);
    }
}
