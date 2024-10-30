package leetcode.ArrayQA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*There is a snake in an n x n matrix grid and can move in four possible directions.
Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.
The snake starts at cell 0 and follows a sequence of commands.

You are given an integer n representing the size of the grid and an array of strings commands
where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT".
It's guaranteed that the snake will remain within the grid boundaries throughout its movement.
Return the position of the final cell where the snake ends up after executing commands.

Example 2:

Input: n = 3, commands = ["DOWN","RIGHT","UP"]

Output: 1

Explanation:

0	1	2
3	4	5
6	7	8

*/
public class SnakeRiLeUpDo {
    public static void main(String[] args) {

        // Test case 1
        int n1 = 2;
        String[] commands1 = {"RIGHT", "DOWN"};
        System.out.println("R -> D :");
        System.out.println(finalPositionOfSnake(n1, List.of(commands1)));  // Output: 3

        // Test case 2
        int n2 = 3;
        String[] commands2 = {"DOWN", "RIGHT", "UP"};
        System.out.println("D -> R -> U :");
        System.out.println(finalPositionOfSnake(n2, List.of(commands2)));  // Output: 1
    }

    public static int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;

        for (String command : commands) {
            switch (command) {
                case "RIGHT":
                    j += 1;
                    break;
                case "UP":
                    i -= 1;
                    break;
                case "LEFT":
                    j -= 1;
                    break;
                case "DOWN":
                    i += 1;
            }
        }
        return (i * n) + j;
    }
}
