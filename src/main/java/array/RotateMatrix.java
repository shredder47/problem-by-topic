package array;

//https://leetcode.com/problems/rotate-image/description/
public class RotateMatrix {

    public void rotate(int[][] matrix) {

        //n*n or squire
        int matrixDimension = matrix.length;

      /*      0 1 2
          0  [1,2,3]
          1  [4,5,6]
          2  [7,8,9]
       */

        int[][] newMatrix = new int[matrixDimension][matrixDimension];

        //copy pattern
        //00 -> 02
        //01 -> 12
        //02 -> 22


        for (int row = 0; row < matrixDimension; row++) {

            for (int col = 0; col < matrixDimension; col++) {

                newMatrix[col][(matrixDimension - 1) - row] = matrix[row][col];

            }


        }

        //mutate original array

        for (int row = 0; row < matrixDimension; row++) {

            for (int col = 0; col < matrixDimension; col++) {

                matrix[row][col] = newMatrix[row][col];
            }
        }

    }
}
