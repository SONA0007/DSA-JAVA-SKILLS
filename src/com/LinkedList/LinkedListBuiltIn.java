package com.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListBuiltIn {
    public static void main(String[] args) {
        LinkedList<Integer> dataList = new LinkedList<>();
        dataList.add(1);
        dataList.add(2);
        dataList.add(3);

       /* for (Integer value : dataList) {
            if (value == 2) {
                dataList.add(99); // Throws ConcurrentModificationException
            }
        }*/

        ListIterator<Integer> iterator = dataList.listIterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value == 2) {
                iterator.add(99); // Add 99 after 2
            }
        }
    }
}
