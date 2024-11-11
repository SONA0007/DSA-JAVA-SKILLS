package leetcode.Easy.ArrayQA;

import java.util.Arrays;

/*  566.
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into
 a new one with a different size r x c keeping its original data.
You are given an m x n matrix mat and two integers r and c representing
the number of rows and the number of columns of the wanted reshaped matrix.
The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal,
output the new reshaped matrix; Otherwise, output the original matrix

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

*/
public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int r = 2;
        int c = 8;
        int[][] reshapedMatrix = matrixReshape(mat, r, c);
        System.out.println("Reshaped Matrix: " + Arrays.deepToString(reshapedMatrix));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        /*if matrix product not matching return original matrix.*/
        if (r * c != m * n) {
            return mat;
        }
        int[][] new_mat = new int[r][c];
        int new_r = 0, new_c = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                new_mat[new_r][new_c] = mat[i][j];
                new_c++;
                if (new_c == c) {
                    new_c = 0;
                    new_r++;
                }
            }
        }
        return new_mat;
    }
}
