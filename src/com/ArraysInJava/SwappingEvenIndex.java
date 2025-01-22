package com.ArraysInJava;

public class SwappingEvenIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < array.length - 2; i += 2) {
            int temp = array[i];
            array[i] = array[i + 2];
            array[i + 2] = temp;
        }
        System.out.println("After swapping : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
