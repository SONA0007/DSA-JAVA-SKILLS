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

        System.out.println(strStr(text, search));
    }

    public static String removeFirstOccurrence(String s, String search_str) {

        int index = s.toLowerCase().indexOf(search_str.toLowerCase());

        if (index != -1) {
            return s.substring(0, index)
                    + s.substring(index + search_str.length());
        }
        return s;
    }

    //leetcode 28: time complexity 1ms and
    // for  return haystack.toLowerCase().indexOf(needle.toLowerCase()); is 0ms
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.length() < needle.length()) {
                return -1;
            }

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
/*  dry run :
*   Loop Execution
    We iterate through haystack with i going from 0 to haystack.length() - needle.length().
*   Here, haystack.length() - needle.length() = 5 - 2 = 3, so i will go from 0 to 3.

Iteration 1 (i = 0):
    We extract haystack.substring(0, 2) which is "he".
    "he" is not equal to needle ("ll"), so we move to the next iteration.

Iteration 2 (i = 1):
    We extract haystack.substring(1, 3) which is "el".
    "el" is not equal to needle ("ll"), so we move to the next iteration.

Iteration 3 (i = 2):
    We extract haystack.substring(2, 4) which is "ll".
    "ll" is equal to needle ("ll"), so the function returns i = 2.

Return Statement
    Since we found needle in haystack at index 2, the function returns 2 and exits.

* */
}
