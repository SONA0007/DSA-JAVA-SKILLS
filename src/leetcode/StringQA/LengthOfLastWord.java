package leetcode.StringQA;

// leetcode 58
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hey , I am finding length of last word!";
        System.out.println("length of last word: " + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        // String[] words = s.split("\\s+");// extra space is required O(m)

        // for (int i = words.length-1; i >=0; i--) {
        //     return words[i].length();
        // }
        // return -1;


        //  Optimized :
        int length = 0;
        int i = s.length() - 1;

        //ignore trailing spaces: spaces or tabs
        //that appear after the last non-whitespace character of a line until the newline.
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        //increment Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {// reach until space found
            length++;
            i--;
        }// No extra space is needed.
        return length;
    }
}
