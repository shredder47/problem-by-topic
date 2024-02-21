package recursivecodes;

import java.util.*;

//https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
public class RatInMaze {

//    Input:
//    N = 4
//    m[][] = {
//             {1, 0, 0, 0},
//             {1, 1, 0, 1},
//             {1, 1, 0, 0},
//             {0, 1, 1, 1}
//            }
//    Output:
//    DDRDRR DRDDRR

    public static ArrayList<String> findPath(int[][] m, int n) {

        ArrayList<String> paths = new ArrayList<>();

        if (m[0][0] == 0 || m[n - 1][n - 1] == 0)
            return paths;

        Set<String> visited = new HashSet<>();
        List<String> currentPath = new ArrayList<>();

        solve(m, n, 0, 0, visited, currentPath, paths);

        return paths;
    }

    private static void solve(int[][] maze, int n, int row, int col, Set<String> visited, List<String> currentPath, ArrayList<String> paths) {

        if (row == n - 1 && col == n - 1) {
            paths.add(String.join("", currentPath));
            return;
        }

        /*
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}

         */

        int newRow = row + 1;
        int newCol = col;

        if (isValidMove(maze, n, newRow, newCol, visited)) {
            visited.add(row + "," + col);
            currentPath.add("D");
            solve(maze, n, newRow, newCol, visited, currentPath, paths);
            backtrack(currentPath, visited, row, col);
        }

        newRow = row - 1;
        newCol = col;

        if (isValidMove(maze, n, newRow, newCol, visited)) {
            visited.add(row + "," + col);
            currentPath.add("U");
            solve(maze, n, newRow, newCol, visited, currentPath, paths);
            backtrack(currentPath, visited, row, col);
        }

        newRow = row;
        newCol = col + 1;
        if (isValidMove(maze, n, newRow, newCol, visited)) {
            visited.add(row + "," + col);
            currentPath.add("R");
            solve(maze, n, newRow, newCol, visited, currentPath, paths);
            backtrack(currentPath, visited, row, col);
        }

        newRow = row;
        newCol = col - 1;

        if (isValidMove(maze, n, newRow, newCol, visited)) {
            visited.add(row + "," + col);
            currentPath.add("L");
            solve(maze, n, newRow, newCol, visited, currentPath, paths);
            backtrack(currentPath, visited, row, col);
        }

    }

    private static void backtrack(List<String> currentPath, Set<String> visited, int row, int col) {
        currentPath.remove(currentPath.size() - 1);
        visited.remove(row + "," + col);

    }

    private static boolean isValidMove(int[][] maze, int n, int row, int col, Set<String> visited) {

        //is not out of bounds
        if (row >= n || row <= -1)
            return false;
        if (col >= n || col <= -1)
            return false;
        //already visited
        if (visited.contains(row + "," + col))
            return false;
        //not obstacle
        if (maze[row][col] == 0)
            return false;

        return true;
    }

}
