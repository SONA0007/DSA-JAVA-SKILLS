package com.ArraysInJava;

public class SwappingEvenIndex {
    public static void main(String[] args) {
        int[] array = {7, 8, 2, 35, 10, 6, 21, 40};
        for (int i = 0; i < array.length - 2; i += 2) {
            int temp = array[i];
            array[i] = array[i + 2];
            array[i + 2] = temp;
        }
        System.out.println("After swapping : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
