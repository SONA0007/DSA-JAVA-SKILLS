package com.BasicCoding;
public class StarPatterns {
    public static void main(String[] args) {
        System.out.println("I am running star package !");
    }
}
class SquareStar{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
class RectangleStar{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" *");
//      We are using print to create rows,
            }
            System.out.println(" ");
//            to create coloumn from for i loop we are using, print _ln in for i loop
        }
    }
}
class InvertedRightAngle{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
class RightAngle{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j > -1; j--) {
            System.out.print(" *");
            }
            System.out.println("  ");
        }
    }
}
class CombineBoth{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j > -1 ; j--) {
                System.out.print("   *");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("   *");
            }
            System.out.println(" ");
        }
    }
}
class Flags{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.println(" ");
                for (int k = j; k < 5; k++) {
                    System.out.print(" *");
                }
            }
        }
    }
}
class Parallelogram{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j > -1; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < 5; k++) {
                System.out.print("   *");
            }
            System.out.println(" ");
        }
    }
}
class InvertedPyramid{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j > -1; j--) {
                System.out.print("  ");
            }
            for (int k = i; k < 5; k++) {
                System.out.print("   *");
            }
            System.out.println(" ");
        }
    }
}
class Pyramid{
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("  ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("   *");
            }
            System.out.println(" ");
        }
    }
}
class KiteShape{
    public static void main(String[] args) {
//       for i loop to make rows
        for (int i = 1; i < 6; i++) {
//           for j loop to add the spaces on starting
            for (int j = i; j < 5; j++) {
                System.out.print("  ");
            }
//          for k loop to increment stars
            for (int k = i; k > 0; k--) {
                System.out.print("   *");
            }
            System.out.println("  ");
        }
        for (int i = 1; i < 5; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = i; k < 5; k++) {
                System.out.print("   *");
            }
            System.out.println("  ");
        }
    }
}
class HollowRectangle{
    public static void main(String[] args) {
        int n = 4;// rows
        int m = 5; // column
//        Can use this logic for above code as well

//        treat it as matrix and each cell is of (row, col)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}

class SpacedRightAngle{
    public static void main(String[] args) {
        int n = 5;// rows
        int m = 6; // column
//        Can use this logic for above code as well

//        treat it as matrix and each cell is of (row, col)
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < m; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

}