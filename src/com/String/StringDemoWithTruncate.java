package com.String;

import java.util.Arrays;

public class StringDemoWithTruncate {
    public static void main(String[] args) {
        String s = new String("Hi! Here is in String Package.    ");

        System.out.println(s.length());
        System.out.println(s.charAt(10));
        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(Arrays.toString((s.split(" ", 3))));

        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println((s.concat("okay?")));
        System.out.println(s);
        System.out.println(s.strip());
        System.out.println(s.replaceFirst("is", "was"));
        System.out.println(s.trim());

        System.out.println(Truncate(s, 4));
    }

    //truncate a string to a certain number of words
    public static String Truncate(String s, int word_limit) {
        /*str.split("\\s+")
        \\s+ is a regular expression that matches one or more whitespace characters
        (including spaces, tabs, and newlines).*/
        String[] words = s.split("\\s+");

        if (words.length <= word_limit) {
            return s;
        }
        StringBuilder truncated_str = new StringBuilder();

        for (int i = 0; i < word_limit; i++) {
            truncated_str.append(words[i]).append(" ");
        }

        return truncated_str.toString().strip();
    }
}
/*trim(): Only removes regular ASCII spaces (' ') from the beginning and end.
Unicode whitespaces, like \u2002, are not removed.
strip(): Removes both regular ASCII spaces and
Unicode whitespace characters from the beginning and end of the string*/