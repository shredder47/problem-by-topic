package array;

import java.util.*;

//https://leetcode.com/problems/set-matrix-zeroes/description/
public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {

        List<String> rowAndCols = scanForZeros(matrix);
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        for (String rowAndCol : rowAndCols) {

            int row = Integer.parseInt(rowAndCol.split(",")[0]);
            rows.add(row);

            int col = Integer.parseInt(rowAndCol.split(",")[1]);
            columns.add(col);
        }

        paintRow(matrix, rows);
        paintColumn(matrix, columns);


    }

    private void paintRow(int[][] arr, List<Integer> rows) {

        for (int collIdx = 0; collIdx < arr[0].length; collIdx++) {

            for (Integer row : rows) {
                arr[row][collIdx] = 0;
            }

        }
    }

    private void paintColumn(int[][] arr, Collection<Integer> columns) {

        for (int rowIdx = 0; rowIdx < arr.length; rowIdx++) {

            for (Integer col : columns) {
                arr[rowIdx][col] = 0;
            }

        }
    }

    private List<String> scanForZeros(int[][] arr) {

        List<String> rowAndCol = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == 0) {
                    rowAndCol.add(i + "," + j);
                }
            }
        }

        return rowAndCol;
    }

    public void printArr(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
    }


}


