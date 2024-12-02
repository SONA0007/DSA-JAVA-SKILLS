package leetcode.Easy.ArrayQA;

/*
You are given row x col grid representing a map where grid[i][j] = 1 represents land
and grid[i][j] = 0 represents water.
Grid cells are connected horizontally/vertically (not diagonally).
 The grid is completely surrounded by water, and there is exactly one
 island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island.
One cell is a square with side length 1. The grid is rectangular,
width and height don't exceed 100. Determine the perimeter of the island.*/
public class IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Check if the cell is land
                if (grid[i][j] == 1) {
                    // Start with 4 sides
                    perimeter += 4;

                    // Check the cell above
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 1;
                    }
                    // Check the cell below
                    if (i < rows - 1 && grid[i + 1][j] == 1) {
                        perimeter -= 1;
                    }
                    // Check the cell to the left
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 1;
                    }
                    // Check the cell to the right
                    if (j < cols - 1 && grid[i][j + 1] == 1) {
                        perimeter -= 1;
                    }
                }
            }
        }

        return perimeter;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        System.out.println("Island Perimeter: " + islandPerimeter(grid));  // Output: 16
    }
}
