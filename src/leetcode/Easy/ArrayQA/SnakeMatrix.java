package leetcode.Easy.ArrayQA;

/*Given an n x n matrix. In the given matrix,
you have to print the elements of the matrix in the snake pattern.
Examples :
Input: mat[][] = { {10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50}};
Output: 10 20 30 40 45 35 25 15 27 29 37 48 50 39 33 32
*/
public class SnakeMatrix {


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        /*  The outer loop iterates through each row of the matrix.
            Even Rows (i % 2 == 0): The inner loop traverses from left to right, printing elements in the current row.
            Odd Rows (i % 2 != 0): The inner loop traverses from right to left, printing elements in the current row.
        */
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.println(arr[i][j]);
                }
            }

        }
    }
}
/*
Result:
The matrix is printed in a “snake” pattern:
First row: left to right.
Second row: right to left.
Third row: left to right.
This pattern continues for larger matrices,
alternating the direction of traversal for each row. 🐍*/