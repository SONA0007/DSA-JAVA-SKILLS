package com.ArraysInJava;

import java.util.Scanner;

public class dotProduct {
    public static void main(String[] args) {
        int[] a = {1, 5, 3};
        int[] b = {7, 8, 2};
        if (a.length != b.length) {
            return;
        }
        int dotProduct = 0;
        for (int i = 0; i < a.length; i++) {
            dotProduct += a[i] * b[i];

        }
        System.out.println("dot product " + dotProduct);

    }
}
