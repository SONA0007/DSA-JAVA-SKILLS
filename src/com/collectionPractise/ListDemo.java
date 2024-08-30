package com.collectionPractise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class  ListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(50);
        arr.add(20);
        System.out.println(arr);

        if (arr.contains(30)) {
            System.out.println("it contains");
        } else {
            System.out.println("not contain");
        }
        for(int num:arr)
            System.out.println(num);
        System.out.println("Iteration using Iterator class");
        Iterator<Integer> i = new Iterator<>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}


