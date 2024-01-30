package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/set-matrix-zeroes/description/
public class SetMatrixZerosOptimized {
    static class Pair<A, B> {
        A first;
        B second;

        Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }

    public void setZeroes(int[][] matrix) {
        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        //Finding Zero Coordinates
        List<Pair<Integer, Integer>> zeroIndices = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (matrix[i][j] == 0) {
                    zeroIndices.add(new Pair<>(i, j));
                }
            }
        }

        // Painting Zeros
        for (Pair<Integer, Integer> pair : zeroIndices) {
            int row = pair.first;
            int column = pair.second;

            //Column Paint
            for (int i = 0; i < numColumns; i++) {
                matrix[row][i] = 0;
            }
            //Row Paint
            for (int i = 0; i < numRows; i++) {
                matrix[i][column] = 0;
            }
        }
    }

    public void printArr(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
    }


}


