package com.ArraysInJava;

import java.util.Scanner;

public class SumOfElementIn2Darr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();
        System.out.println("Enter no. of colomns");
        int cols = sc.nextInt();

        System.out.println("Enter matrix");
        int[][] numbers = new int[rows][cols];
        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // Printing array elements, summing elements
        int total = 0;
        int coountrows = numbers.length;
        int countcolomns = numbers[0].length;

        int totalElements = rows * cols;
        System.out.println("count rows " + coountrows);
        System.out.println("count colomns " + countcolomns);
        System.out.println("count total elements " + totalElements);

        // total sum of array elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                total += numbers[i][j];
            }
        }
        System.out.println("Total sum of element " + total);
    }

}
