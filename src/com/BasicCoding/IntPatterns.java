package com.BasicCoding;

public class IntPatterns {
    public static void main(String[] args) {
        System.out.println("I am here to print integer patterns");
    }
}
class SquareInt{
    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("  "+j);
            }
            System.out.println(" ");
        }
    }
}
class RectangleInt{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+i);
            }
            System.out.println(" ");
        }
    }
}
class InvertedRightAngleInt{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
    }
}
class RightAngleInt{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >-1; j--) {
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
    }
}
class parallelogramInt{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 5; k++) {
                System.out.print("  "+k);
            }
            System.out.println(" ");
        }
    }
}
class invertedPyramidInt{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = i; k < 5; k++) {
                System.out.print("   "+i);
            }
            System.out.println(" ");
        }
    }
}
class PyramidInt{
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >0 ; k--) {
                System.out.print("   "+i);
            }
            System.out.println("  ");
        }
    }
}
class KiteShapeInt{
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("   ");
            }
            for (int k = i; k >0 ; k--) {
                System.out.print("     "+i);
            }
            System.out.println("    ");
        }
        // to flip the first half we need to change the logic of rows only
        for (int i = 4; i > 0 ; i--) {
            for (int j = i; j < 5; j++) {
                System.out.print("   ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("     "+i);
            }
            System.out.println("    ");
        }
    }
}
class OneToFifteenTriangle{
    public static void main(String[] args) {
        int n = 4;//rows
        int num = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = i; j > -1 ; j--) {
                System.out.print(num+"  ");
                num++;
            }
            System.out.println();
        }
    }
}
class ZeroOneTriangle{
    public static void main(String[] args) {
        int n =5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                int num = i+j;
                if (num % 2 == 0) {
                    System.out.print("1"+" ");
                }else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println(" ");
        }
    }
}

class PalindromePyramid{
    public static void main(String[] args) {
        int n = 6;
        // i represent row no.
        for (int i = 1; i < n; i++) {
            //Spaces
            for (int j = 1; j < n-i; j++) {
                System.out.print("  ");
            }
            //first half
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            //second Half
            for (int j = 2; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}