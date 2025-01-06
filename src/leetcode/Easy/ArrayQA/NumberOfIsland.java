package leetcode.Easy.ArrayQA;

/*Given an m x n 2D binary grid
 grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.*/
public class NumberOfIsland {
    public int numOfCount(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }//grid check
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        // making all other surrounding  island to 0 , keeping count to 1for first iteration
        grid[i][j] = '0'; // Mark the current cell as visited
        callBFS(grid, i + 1, j); // Up
        callBFS(grid, i - 1, j); // Down
        callBFS(grid, i, j + 1); // Right
        callBFS(grid, i, j - 1); // Left
    }

    public static void main(String[] args) {
        NumberOfIsland numberOfIsland = new NumberOfIsland();

        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int result = numberOfIsland.numOfCount(grid);
        System.out.println("Number of islands: " + result); // Expected output: 3
    }
}
