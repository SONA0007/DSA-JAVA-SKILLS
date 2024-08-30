package com.collectionPractise;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class  SetDemo{
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        s.add(10);
        s.add(120);
        s.add(110);
        if (s.size()>2) System.out.println("True");

        for (int i = 0; i < 1; i++) {
            System.out.println(s);
        }
        System.out.println(s);
    }
}
