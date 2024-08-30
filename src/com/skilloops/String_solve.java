package com.skilloops;

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
//WITHOUT USING SWAP METHOD OT TEMP VAR
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

class IntegerSwap{

    public static void main(String[] args) {
        Integer a =10;
        Integer b =50;

        int i=11;
        int j=21 ;
//       if we write logic in main method it is swapping values and initialize them inmain method
        swap(i,j);
        System.out.println("i : "+i+" j : "+j);
        swap(a,b);
        System.out.println("a"+ a+ " b "+b);
    }
        static void swap(Integer a, Integer b){
            Integer temp ;
            temp = a;
            a = b;
            b = temp;
//      logic written in outside main in another method
//            int t = i;
//            i=j;
//            j=t;
//            why is not swapping -- bcoz of Integer class is Final
        }
}
