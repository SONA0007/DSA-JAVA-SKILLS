package com.ArraysInJava;

import java.util.Arrays;

public class OperationsOnArray {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday","Tuesday", "Wednesday"};
        for (String day : daysOfWeek) {
            System.out.println(day);
        }
        // Step 1: Declare an array
        int[] daysInMonth = new int[12];
        // Step 2: Dynamically initialize the array
        daysInMonth[0] = 31; // January
        daysInMonth[1] = 28; // February
        daysInMonth[2] = 31; // March
        daysInMonth[3] = 30; // April
        daysInMonth[4] = 31; // May
        daysInMonth[5] = 30; // June
        daysInMonth[6] = 31; // July
        daysInMonth[7] = 31; // August
        daysInMonth[8] = 30; // September
        daysInMonth[9] = 31; // October
        daysInMonth[10] = 30; //November
        daysInMonth[11] = 31; //December
        // Step 3: Declare an array with the names of the months
        String[] monthNames = { "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        // Step 4: Print the number of days in each month
        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.println(monthNames[i] + ": " + daysInMonth[i] + " days");
        }

        /*Deletion in array*/
        int[] myArray = {1, 2, 3, 4, 5};
        int position = 2; // index of the element to delete

        int[] newArray = new int[myArray.length - 1];

        for (int i = 0, j = 0; i < myArray.length; i++) {
            if (i == position) continue;
            newArray[j++] = myArray[i];
        }
        System.out.println(Arrays.toString(newArray));

        /*Insertion in array*/
        int[] myArr = {1, 2, 3, 4, 5};
        int posi = 2; // index where you want to insert
        int newElement = 10;

        int[] newArr = new int[myArr.length + 1];

        for (int i = 0, j = 0; i < myArr.length; i++, j++) {
            if (j == posi) {
                newArr[j] = newElement;
                j++;
            }
            newArr[j] = myArr[i];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
