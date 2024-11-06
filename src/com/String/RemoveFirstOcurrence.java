package com.String;

public class RemoveFirstOcurrence {
    public static void main(String[] args) {
        String text = "quick brown fox jumps over the lazy dog";
        String search = "the";

        if (text.contains("the")) {
            System.out.println("word is in text.");
        } else {
            System.out.println("word nor found.");
        }
        String result = removeFirstOccurrence(text, search);
        System.out.println("Output after removing word : " + result);


    }

    public static String removeFirstOccurrence(String s, String search_str) {

        int index = s.toLowerCase().indexOf(search_str.toLowerCase());

        if (index != -1) {
            return s.substring(0, index)
                    + s.substring(index + search_str.length());
        }
        return s;
    }
}
