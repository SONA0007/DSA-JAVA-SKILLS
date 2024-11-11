package leetcode.Easy.ArrayQA;

public class IntPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int originalx = x; // 121
        int reversedx = 0;

        if (x < 0)
            return false;

        //we are working on reversed x value to match it with originalx value
        while (x != 0) {
            int lastdigit = x % 10;             // 121 % 10 = 1  //12 % 10=2  // 1%10=1
            reversedx = reversedx * 10 + lastdigit;// 0*10+1 = 1    //1*10+2 =12  // 12*10+1=121
            x = x / 10;                         // 12            //1           //0 --end
        }
        return originalx == reversedx;
    }
}
