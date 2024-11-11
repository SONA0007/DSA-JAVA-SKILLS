package leetcode.Easy.ArrayQA;

/*You are given a matrix of dimensions n x m.
The task is to perform boundary traversal on the matrix
in a clockwise manner starting from the first row of the matrix.
Example 1:
Input:
n = 4, m = 4
matrix[][] = {{1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12},
         {13, 14, 15,16}}
Output: 1 2 3 4 8 12 16 15 14 13 9 5*/
public class BoundryTraversalMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        //first row i=0
        for (int j = 0; j < matrix.length; j++) {
            System.out.println(matrix[0][j]);
        }
        //last column j = matrix.length-1
        for (int i = 1; i < matrix.length; i++) {
            System.out.println(matrix[i][matrix.length - 1]);
        }
        //last row i = matrix.length-1
        for (int j = matrix.length - 2; j >= 0; j--) {
            System.out.println(matrix[matrix.length - 1][j]);
        }
        //last column j = 0
        for (int i = matrix.length - 2; i >= 0; i--) {
            System.out.println(matrix[i][0]);
        }

    }
}
