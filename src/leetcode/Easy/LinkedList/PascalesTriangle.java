package leetcode.Easy.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PascalesTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // if triangle is empty
        if (numRows < 0) {
            return triangle;
        }
        // Adding rows to triangle
        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            // we create new inner list of outer list , which itself is row of triangle
            List<Integer> row = new ArrayList<>();

            // now iteration for columns of that inner current row list
            for (int colIndex = 0; colIndex <= rowIndex; colIndex++) {
                if (colIndex == 0 || colIndex == rowIndex) {
                    row.add(1);
                } else {
                    int left = triangle.get(rowIndex - 1).get(colIndex - 1); // rowIndex - 1 previous row
                    int right = triangle.get(rowIndex - 1).get(colIndex);
                    row.add(left + right);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalesTriangle pt = new PascalesTriangle();
        int numRows = 5;

        List<List<Integer>> result = pt.generate(numRows);
        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
