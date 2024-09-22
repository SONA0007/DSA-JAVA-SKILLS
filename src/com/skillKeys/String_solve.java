package com.skillKeys;

public class String_solve {
    public static void main(String[] args) {

        String s1 = "Peter";
        String s2 = "Peter";
        String s3 = new String("Peter");
        String s4 = new String("Peter");

        String one = new String("Somehting");
        String two = one;// two is reference var to object one pointing to same heap memory location
        System.out.println(two);

        /*Checking comparison operators
         * s1 == s2 EQUALS
         * s2 == s3 NOT EQUALS
         * s3 == s4 NOT EQUALS
         * s1 == s3 NOT EQUALS
         * */
        if (s3.equals(s4)) System.out.println("Equals");
        else System.out.println("Not Equals");
//        we know something that is not static belongs to an object
    }
}

class StringSwap {

    String str = "Sonal";// it is instance of the class or instance var
//    you can't access them in main method

     String n = new String("new string instance var");

    public static void main(String[] args) {

        StringSwap s = new StringSwap();
        System.out.println(s.str);
        System.out.println(s.n.equals("me"));

        System.out.println(s.n.equals("new string instance var"));

        String s1 = "sonal";
        String s2 = "somesh";

        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("My name in s1 - " + s1);
        System.out.println("My name in s2 - " + s2);
    }
}
// Everything is passed by value
//WITHOUT USING SWAP METHOD TO TEM
class withoutTempint{
    public static void main(String[] args) {
        int i1 =5;
        int i2 =10;
        System.out.println("Before swaping " + "i1 = " + i1 +" "+ "i2 = " + i2);

        i1 = i1+i2;// i1= 15
        i2 = i1-i2;// 15 - 10 = 5
        i1 = i1-i2;// 15 - 5 = 10

        System.out.println("After swaping " + "i1 = " + i1 +" "+ "i2 = " + i2);
    }
}
// Incorrect swap
class IncoorectIntegerSwap {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 50;

        int i = 11;
        int j = 21;

        // Attempting to swap i and j
        swap(i, j);
        System.out.println("i: " + i + " j: " + j);  // Outputs: i: 11 j: 21 (no swap)

        // Attempting to swap a and b
        swap(a, b);
        System.out.println("a: " + a + " b: " + b);  // Outputs: a: 10 b: 50 (no swap)
    }

    static void swap(Integer a, Integer b) {
        Integer temp;
        temp = a;
        a = b;
        b = temp;

        // This swap only affects the local copies of a and b inside this method.
    }
}

// Correct way to swap
class IntWrapper {
    public int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}
//if we write logic in main method it is swapping values and initialize them in main method

class CorrectIntegerSwap {
    public static void main(String[] args) {
        IntWrapper i = new IntWrapper(11);
        IntWrapper j = new IntWrapper(21);

        swap(i, j);
        System.out.println("i: " + i.value + " j: " + j.value);  // Outputs: i: 21 j: 11
    }

    static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
// Incorrect swap


